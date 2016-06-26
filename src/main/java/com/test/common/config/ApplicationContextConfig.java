package com.test.common.config;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.FilterType;
import org.springframework.stereotype.Controller;

/**
 * Created by miaorf on 2016/6/19.
 */
@Configuration
@EnableAutoConfiguration
@ComponentScan(basePackageClasses = ApplicationContextConfig.class,
        excludeFilters = {@ComponentScan.Filter(type = FilterType.ANNOTATION,value = {Controller.class})})

@SuppressWarnings("PMD.UseSingleton")
public class ApplicationContextConfig {

    public static void main(String[] args) {
        SpringApplication.run(ApplicationContextConfig.class);
    }
}
