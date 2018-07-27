package com.sinotrans.Util;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.view.JstlView;
import org.springframework.web.servlet.view.UrlBasedViewResolver;

/*
 *
 * @auth  changfan
 * @date 2018-7-26
 * @time 20:04
 */
@Configuration
public class DefaultConfiguration {
    @Bean
    public UrlBasedViewResolver setupViewResolver() {
        UrlBasedViewResolver resolver = new UrlBasedViewResolver();
        resolver.setPrefix("/static/page/");
        resolver.setSuffix(".html");
        resolver.setCache(true);
        resolver.setViewClass(JstlView.class);
        return resolver;
    }

}