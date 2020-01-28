package se.arbetsformedlingen.matchning.portability.configuration;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.InterceptorRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;
import se.arbetsformedlingen.matchning.portability.logging.*;

@Configuration
public class PortabilityConfig implements WebMvcConfigurer {

    @Autowired
    private PortabilityInterceptor portabilityInterceptor;

    @Override
    public void addInterceptors(InterceptorRegistry registry) {
        registry.addInterceptor(portabilityInterceptor).addPathPatterns("/**");
    }
}
