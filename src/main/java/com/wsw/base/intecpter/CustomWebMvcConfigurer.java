package com.wsw.base.intecpter;

import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.InterceptorRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

//@Configuration
public class CustomWebMvcConfigurer implements WebMvcConfigurer  {

	@Override
	public void addInterceptors(InterceptorRegistry registry) {

		registry.addInterceptor(new LoginIntercepter()).addPathPatterns("/api2/*/**");
		registry.addInterceptor(new TwoIntercepter()).addPathPatterns("/api2/*/**");
		
		//.excludePathPatterns("/api2/xxx/**"); //拦截全部 /*/*/**

		this.addInterceptors(registry);
	}

	
	
	


}
