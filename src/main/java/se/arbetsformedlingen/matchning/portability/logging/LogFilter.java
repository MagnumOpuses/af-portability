package se.arbetsformedlingen.matchning.portability.logging;

import com.jayway.jsonpath.Configuration;
import com.jayway.jsonpath.JsonPath;
import com.jayway.jsonpath.Option;
import org.apache.http.NameValuePair;
import org.apache.http.client.utils.URLEncodedUtils;
import org.json.JSONException;
import org.json.JSONObject;
import org.springframework.stereotype.Component;
import org.springframework.web.filter.OncePerRequestFilter;
import org.springframework.web.util.ContentCachingRequestWrapper;
import org.springframework.web.util.ContentCachingResponseWrapper;

import javax.servlet.FilterChain;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.net.URI;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.*;

import org.apache.logging.log4j.Logger;
import org.apache.logging.log4j.LogManager;

import java.util.regex.Pattern;

/**
 * <p>
 * Logs every request with as much information as possible.
 * </p>
 *
 * <p>
 * Also sends alerts when a request took too long.
 * </p>
 *
 */
@Component
public class LogFilter extends OncePerRequestFilter {

    private static Logger logger = LogManager.getLogger(LogFilter.class.getCanonicalName());

    protected void doLog(ContentCachingRequestWrapper requestWrapper, ContentCachingResponseWrapper responseWrapper, Long responseTime) {

        // Create a dateformant compliant with ISO8601
        final DateFormat ISO8601 = new SimpleDateFormat("yyyy-MM-dd'T'HH:mm'Z'");
        ISO8601.setTimeZone(TimeZone.getTimeZone("UTC"));

        // Parse query parameters into array of key-value pairs
        final String queryString = requestWrapper.getQueryString();
        final String url = requestWrapper.getRequestURI() + (queryString != null && queryString.length() > 0 ? "?" + queryString: "");
        final List<NameValuePair> queryParams = URLEncodedUtils.parse(queryString, Charset.forName("UTF-8"));

        // Produce JSON structure and write to STDOUT
        try {
            final JSONObject reqHeaders = new JSONObject()
                    .put("host", String.format("%s:%s", requestWrapper.getServerName(), requestWrapper.getServerPort()))
                    .put("connection", requestWrapper.getHeader("connection"))
                    .put("user-agent", requestWrapper.getHeader("user-agent"))
                    .put("accept", requestWrapper.getHeader("accept"))
                    .put("accept-encoding", requestWrapper.getHeader("accept-encoding"))
                    .put("origin", requestWrapper.getHeader("origin"))
                    .put("referer", requestWrapper.getHeader("referer"))
                    .put("sec-fetch-dest", requestWrapper.getHeader("sec-fetch-dest"))
                    .put("sec-fetch-mode", requestWrapper.getHeader("sec-fetch-mode"))
                    .put("sec-fetch-site", requestWrapper.getHeader("sec-fetch-site"))
                    .put("method", requestWrapper.getMethod())
                    .put("httpVersion", requestWrapper.getProtocol())
                    .put("content-type", responseWrapper.getContentType())
                    .put("content-length", String.valueOf(responseWrapper.getContentAsByteArray().length));

            final JSONObject reqQuery = new JSONObject();
            for (NameValuePair param : queryParams) {
                reqQuery.put(param.getName(), param.getValue());
            }

            final JSONObject req = new JSONObject()
                    .put("headers", reqHeaders)
                    .put("query", reqQuery)
                    .put("originalUrl", url)
                    .put("url", url)
                    .put("method", requestWrapper.getMethod())
                    .put("httpVersion", requestWrapper.getProtocol());

            final JSONObject res = new JSONObject()
                    .put("statusCode", responseWrapper.getStatusCode());

            final JSONObject meta = new JSONObject()
                    .put("req", req)
                    .put("res", res)
                    .put("responseTime", responseTime);

            final JSONObject entry = new JSONObject()
                    .put("meta", meta)
                    .put("level", "info")
                    .put("message", String.format("%s %s %s",
                            requestWrapper.getScheme().toUpperCase(),
                            requestWrapper.getMethod(),
                            url))
                    .put("timestamp", ISO8601.format(new Date()));

            System.out.println(entry.toString());
        } catch (JSONException e) {
            e.printStackTrace();
        }
    }

    @Override
    protected void doFilterInternal(HttpServletRequest request, HttpServletResponse response, FilterChain filterChain)
            throws ServletException, IOException {

        ContentCachingRequestWrapper requestWrapper = new ContentCachingRequestWrapper(request);
        ContentCachingResponseWrapper responseWrapper = new ContentCachingResponseWrapper(response);

        long start = System.currentTimeMillis();
        filterChain.doFilter(requestWrapper, responseWrapper);
        long responseTime = System.currentTimeMillis() - start;
        doLog(requestWrapper, responseWrapper, responseTime);
        responseWrapper.copyBodyToResponse();
    }

}
