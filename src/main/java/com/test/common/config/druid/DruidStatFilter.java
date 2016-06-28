package com.test.common.config.druid;

import com.alibaba.druid.support.http.WebStatFilter;
import org.springframework.context.annotation.Configuration;

import javax.servlet.annotation.WebFilter;
import javax.servlet.annotation.WebInitParam;

/**
 * Created by miaorf on 2016/6/26.
 */
@Configuration
@WebFilter(filterName="druidWebStatFilter",urlPatterns="/*",
        initParams={
                @WebInitParam(name="exclusions",value="*.js,*.gif,*.jpg,*.bmp,*.png,*.css,*.ico,/druid/*")// 忽略资源
        })
public class DruidStatFilter extends WebStatFilter {

}