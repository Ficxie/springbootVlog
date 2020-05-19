package com.fic.blog.mylove.config;

import com.fic.blog.mylove.config.bean.MyLocalResolver;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.LocaleResolver;

@Configuration
public class CommonConfig {
    @Bean
    public LocaleResolver localeResolver() {
        return new MyLocalResolver();
    }
}
