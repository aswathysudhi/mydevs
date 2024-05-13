package com.shpooing.Shopping.Config;

import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.CorsRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

@Configuration
public class CorsConfig  implements WebMvcConfigurer  {
	 @Override
	    public void addCorsMappings(CorsRegistry registry) {
	        registry.addMapping("/products").allowedOrigins("http://localhost:4200");
	        // Add more mappings if needed
	    }

}
