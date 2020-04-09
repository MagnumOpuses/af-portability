package se.arbetsformedlingen.matchning.portability.logging;

import com.jayway.jsonpath.Configuration;
import com.jayway.jsonpath.JsonPath;
import com.jayway.jsonpath.Option;
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
        Map<String, String> logMap = new HashMap<>();
        boolean sessionTokenFound = false;

        Configuration nullConfiguration = Configuration.builder().options(Option.DEFAULT_PATH_LEAF_TO_NULL).build();

        logMap.put("host", requestWrapper.getRemoteAddr() + "/" + requestWrapper.getRemoteHost()); //This gets IPs not the service
        logMap.put("method", requestWrapper.getMethod());
        logMap.put("url", requestWrapper.getRequestURI());

        if (requestWrapper.getParameterValues("sessionToken") != null) {
            logMap.put("sessionToken", requestWrapper.getParameterValues("sessionToken")[0]);
            sessionTokenFound = true;
        }

        Long duration = (Long)requestWrapper.getRequest().getAttribute("duration");

        logMap.put("statusCode", String.valueOf(responseWrapper.getStatusCode()));

        if (duration != null) {
            logMap.put("responseTime", String.valueOf(duration));
        }
        logMap.put("contentType", responseWrapper.getContentType());

        logMap.put("contentLength", String.valueOf(responseWrapper.getContentAsByteArray().length));

        logMap.put("user-agent", requestWrapper.getHeader("user-agent"));
        logMap.put("accept-encoding", requestWrapper.getHeader("accept"));
        logMap.put("conneciton", requestWrapper.getHeader("connection"));
        logMap.put("protocol", requestWrapper.getProtocol());

        TimeZone tz = TimeZone.getTimeZone("UTC");
        DateFormat df = new SimpleDateFormat("yyyy-MM-dd'T'HH:mm'Z'"); // Quoted "Z" to indicate UTC, no timezone offset
        df.setTimeZone(tz);
        String time = df.format(new Date());
        logMap.put("contentType", String.valueOf(time));


        JSONObject message = new JSONObject(logMap);
        // System.out.println(logMap);
        logger.info(logMap);
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
