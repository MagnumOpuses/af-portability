package se.arbetsformedlingen.matchning.portability.logging;

import com.jayway.jsonpath.Configuration;
import com.jayway.jsonpath.JsonPath;
import com.jayway.jsonpath.Option;
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
import java.nio.charset.StandardCharsets;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.HashMap;
import java.util.Map;
import org.apache.logging.log4j.Logger;
import org.apache.logging.log4j.LogManager;

import java.util.TimeZone;
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

    protected void doLog(ContentCachingRequestWrapper requestWrapper, ContentCachingResponseWrapper responseWrapper) {
        String requestBody = "";
        String responseBody = "";
        boolean sessionTokenFound = false;
        String sessionToken = " ";
        String responseTime = " ";


        Configuration nullConfiguration = Configuration.builder().options(Option.DEFAULT_PATH_LEAF_TO_NULL).build();

        String userAgent = requestWrapper.getHeader("user-agent");
        String accept = requestWrapper.getHeader("accept");
        String connection = requestWrapper.getHeader("connection");
        String protocol = requestWrapper.getProtocol();

        String host = requestWrapper.getRemoteAddr() + "/" + requestWrapper.getRemoteHost();
        String method = requestWrapper.getMethod();
        String url = requestWrapper.getRequestURI();
        String statusCode = String.valueOf(responseWrapper.getStatusCode());
        String contentType = responseWrapper.getContentType();
        String contentLength = String.valueOf(responseWrapper.getContentAsByteArray().length);



        if (requestWrapper.getParameterValues("sessionToken") != null) {
            sessionToken = requestWrapper.getParameterValues("sessionToken")[0];
            sessionTokenFound = true;
        }

        Long duration = (Long)requestWrapper.getRequest().getAttribute("duration");
        if (duration != null) {
            responseTime = String.valueOf(duration);
        }

        TimeZone tz = TimeZone.getTimeZone("UTC");
        DateFormat df = new SimpleDateFormat("yyyy-MM-dd'T'HH:mm'Z'"); // Quoted "Z" to indicate UTC, no timezone offset
        df.setTimeZone(tz);
        String time = df.format(new Date());

        final String jsonString;
        try {
            jsonString = new JSONObject()
                    .put("meta", new JSONObject()
                            .put("req", new JSONObject()
                                    .put("url", url)
                                    .put("headers", new JSONObject()
                                            .put("host", host)
                                            .put("connection", connection)
                                            .put("user-agent", userAgent)
                                            .put("accept-encoding", accept))
                                    .put("method", method)
                                    .put("httpVersion", protocol)
                                    .put("originalUrl", url)
                                    .put("query", new JSONObject()
                                            .put("sessionToken", sessionToken)))
                            .put("res", new JSONObject()
                                    .put("statusCode", statusCode))
                            .put("responseTime", 123))
                    .put("message", protocol +  method + url)
                    .put("timestamp", time)
                    .put("level", "info")
                    .put("contentType", contentType)
                    .put("contentLength", contentLength)
                    .put("responseTime", responseTime)
                    .toString();

            System.out.println(jsonString);
        } catch (JSONException e) {
            e.printStackTrace();
        }

    }

    @Override
    protected void doFilterInternal(HttpServletRequest request, HttpServletResponse response, FilterChain filterChain)
            throws ServletException, IOException {

        ContentCachingRequestWrapper requestWrapper = new ContentCachingRequestWrapper(request);
        ContentCachingResponseWrapper responseWrapper = new ContentCachingResponseWrapper(response);

        filterChain.doFilter(requestWrapper, responseWrapper);
        doLog(requestWrapper, responseWrapper);
        responseWrapper.copyBodyToResponse();
    }

}
