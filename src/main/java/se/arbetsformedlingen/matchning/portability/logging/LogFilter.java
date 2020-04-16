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

        String requestBody = "";
        String responseBody = "";
        boolean sessionTokenFound = false;
        String sessionToken = " ";

        Configuration nullConfiguration = Configuration.builder().options(Option.DEFAULT_PATH_LEAF_TO_NULL).build();

        String userAgent = requestWrapper.getHeader("user-agent");
        String accept = requestWrapper.getHeader("accept");
        String acceptEncoding = requestWrapper.getHeader("accept-encoding");
        String connection = requestWrapper.getHeader("connection");
        String origin = requestWrapper.getHeader("origin");
        String referer = requestWrapper.getHeader("referer");
        String secFetchMode = requestWrapper.getHeader("sec-fetch-mode");
        String secFetchSite = requestWrapper.getHeader("sec-fetch-site");
        String secFetchDest = requestWrapper.getHeader("sec-fetch-dest");
        String protocol = requestWrapper.getProtocol();
        String scheme = requestWrapper.getScheme().toUpperCase();
        boolean isSecure = requestWrapper.isSecure();

        //String host = requestWrapper.getRemoteAddr() + "/" + requestWrapper.getRemoteHost();
        String host = String.format("%s:%s", requestWrapper.getServerName(), requestWrapper.getServerPort());
        String method = requestWrapper.getMethod();
        int statusCode = responseWrapper.getStatusCode();
        String contentType = responseWrapper.getContentType();
        String contentLength = String.valueOf(responseWrapper.getContentAsByteArray().length);

        String queryString = requestWrapper.getQueryString();
        String url = requestWrapper.getRequestURI() + (queryString.length() > 0 ? "?" + queryString: "");
        List<NameValuePair> queryParams = URLEncodedUtils.parse(queryString, Charset.forName("UTF-8"));

        /*if (requestWrapper.getParameterValues("sessionToken") != null) {
            sessionToken = requestWrapper.getParameterValues("sessionToken")[0];
            sessionTokenFound = true;
        }*/

        TimeZone tz = TimeZone.getTimeZone("UTC");
        DateFormat df = new SimpleDateFormat("yyyy-MM-dd'T'HH:mm'Z'"); // Quoted "Z" to indicate UTC, no timezone offset
        df.setTimeZone(tz);
        String time = df.format(new Date());

        final String jsonString;
        try {
            JSONObject jsonQueryParams = new JSONObject();
            for (NameValuePair param : queryParams) {
                jsonQueryParams.put(param.getName(), param.getValue());
            }

            jsonString = new JSONObject()
                    .put("meta", new JSONObject()
                            .put("req", new JSONObject()
                                    .put("url", url)
                                    .put("headers", new JSONObject()
                                            .put("host", host)
                                            .put("connection", connection)
                                            .put("user-agent", userAgent)
                                            .put("accept", accept)
                                            .put("accept-encoding", acceptEncoding)
                                            .put("origin", origin)
                                            .put("content-type", contentType)
                                            .put("content-length", contentLength)
                                            .put("referer", referer)
                                            .put("sec-fetch-dest", secFetchDest)
                                            .put("sec-fetch-mode", secFetchMode)
                                            .put("sec-fetch-site", secFetchSite))
                                    .put("method", method)
                                    .put("httpVersion", protocol)
                                    .put("originalUrl", url)
                                    .put("query", jsonQueryParams))
                            .put("res", new JSONObject()
                                    .put("statusCode", statusCode))
                            .put("responseTime", Math.toIntExact(responseTime)))
                    .put("message", String.format("%s %s %s", scheme, method, url))
                    .put("timestamp", time)
                    .put("level", "info")
                    .toString();

            System.out.println(jsonString);
            System.out.println("OK");
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
