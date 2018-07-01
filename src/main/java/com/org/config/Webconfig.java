package com.org.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.http.converter.HttpMessageConverter;
import org.springframework.http.converter.json.MappingJackson2HttpMessageConverter;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurerAdapter;
import org.springframework.web.servlet.mvc.annotation.AnnotationMethodHandlerAdapter;
@Configuration
@EnableWebMvc
@ComponentScan(basePackages="com.org")
public class Webconfig extends WebMvcConfigurerAdapter {
   
	
	/*@Bean
	public AnnotationMethodHandlerAdapter annotationMethodHandlerAdapter() {
	    AnnotationMethodHandlerAdapter adapter = new AnnotationMethodHandlerAdapter();
	    adapter.setCustomArgumentResolver(new BlossomWebArgumentResolver());
	    return adapter;
	}*/
	
	
/*	 @Bean
	    public AnnotationMethodHandlerAdapter annotationMethodHandlerAdapter() {
	        HttpMessageConverter<?>[] converters = { new MappingJackson2HttpMessageConverter()};

	        AnnotationMethodHandlerAdapter adapter = new AnnotationMethodHandlerAdapter();
	        adapter.setMessageConverters(converters);

	        return  adapter;
	 }*/
}