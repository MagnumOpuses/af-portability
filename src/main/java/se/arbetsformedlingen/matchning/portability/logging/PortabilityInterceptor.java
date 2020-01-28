package se.arbetsformedlingen.matchning.portability.logging;

import org.springframework.stereotype.Component;
import org.springframework.web.servlet.handler.HandlerInterceptorAdapter;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

/**
 * <p>
 * Adds attributes to the request that help with timing and profiling.
 * </p>
 *
 */
@Component
public class PortabilityInterceptor extends HandlerInterceptorAdapter {

    @Override
    public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler) {
        request.setAttribute("startTimestamp", System.currentTimeMillis());

        return true;
    }

    @Override
    public void afterCompletion(HttpServletRequest request, HttpServletResponse response,
                                Object handler, Exception ex) throws IOException {

        Long endTimestamp = System.currentTimeMillis();
        Long startTimestamp = (Long)request.getAttribute("startTimestamp");

        request.setAttribute("endTimestamp", endTimestamp);

        if (startTimestamp != null) {
            request.setAttribute("duration", endTimestamp - startTimestamp);
        }
    }

}
