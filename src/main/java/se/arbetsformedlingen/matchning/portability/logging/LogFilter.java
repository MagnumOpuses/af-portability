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
import java.util.HashMap;
import java.util.Map;
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

    protected void doLog(ContentCachingRequestWrapper requestWrapper, ContentCachingResponseWrapper responseWrapper) {
        String requestBody = "";
        String responseBody = "";
        Map<String, String> logMap = new HashMap<>();
        boolean sessionTokenFound = false;

        Configuration nullConfiguration = Configuration.builder().options(Option.DEFAULT_PATH_LEAF_TO_NULL).build();

        logMap.put("Host", requestWrapper.getRemoteAddr() + " ---- " + requestWrapper.getRemoteHost());
        logMap.put("Method", requestWrapper.getMethod());
        logMap.put("URI", requestWrapper.getRequestURI());

        if (requestWrapper.getParameterValues("sessionToken") != null) {
            logMap.put("SessionToken", requestWrapper.getParameterValues("sessionToken")[0]);
            sessionTokenFound = true;
        }

        Long duration = (Long)requestWrapper.getRequest().getAttribute("duration");

        logMap.put("Status code", String.valueOf(responseWrapper.getStatusCode()));

        if (duration != null) {
            logMap.put("duration", String.valueOf(duration));
        }
        logMap.put("Content Type", responseWrapper.getContentType());

        logMap.put("Content Length", String.valueOf(responseWrapper.getContentAsByteArray().length) + " bytes");

        JSONObject message = new JSONObject(logMap);
        logger.info(message);
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
