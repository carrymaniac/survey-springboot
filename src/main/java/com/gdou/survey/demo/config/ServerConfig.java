package com.gdou.survey.demo.config;

import com.gdou.survey.demo.common.CrossOriginesourceSharingFilter;
import org.springframework.boot.web.servlet.FilterRegistrationBean;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.util.Arrays;

@Configuration
public class ServerConfig {
    @Bean
    public FilterRegistrationBean myFilter(){
        FilterRegistrationBean registrationBean = new FilterRegistrationBean();
        registrationBean.setFilter(new CrossOriginesourceSharingFilter());
        registrationBean.setUrlPatterns(Arrays.asList("/"));
        return registrationBean;
    }

}
