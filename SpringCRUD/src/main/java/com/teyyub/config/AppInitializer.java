package com.teyyub.config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import org.springframework.web.servlet.support.AbstractAnnotationConfigDispatcherServletInitializer;

/**
 *
 * @author teyyub , 5:47:49 PM
 */
@EnableWebMvc
@ComponentScan(basePackages = "com.teyyub")
public class AppInitializer extends  AbstractAnnotationConfigDispatcherServletInitializer {

    @Override
    protected Class<?>[] getRootConfigClasses() {
         return null;
    }

    @Override
    protected Class<?>[] getServletConfigClasses() {
          return new Class<?>[] { WebConfig.class , WebSecurityConfig.class };
    }

    @Override
    protected String[] getServletMappings() {
         return new String[] { "/" };
    }

    
    
}
