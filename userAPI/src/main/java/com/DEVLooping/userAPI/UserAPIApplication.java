package com.DEVLooping.userAPI;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.web.servlet.config.annotation.CorsRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

import io.swagger.v3.oas.models.OpenAPI;

@SpringBootApplication
public class UserAPIApplication {

	public static void main(String[] args) {
		SpringApplication.run(UserAPIApplication.class, args);


	}
	@Bean
	public OpenAPI customOpenAPI(){
		return new OpenAPI().info(new io.swagger.v3.oas.models.info.Info()
		.title("MedServ | API de Usuarios")
		.version("1.0")
		.description("Documentación para la API de gestión de usuarios de MedServ"));
	}

	@Bean
	public WebMvcConfigurer corsConfigurer(){
		return new WebMvcConfigurer(){
			@Override
			public void addCorsMappings(CorsRegistry registry){
				registry.addMapping("/api/**")
				.allowedOrigins("http://localhost:5173")
				.allowedMethods("*")
				.allowedHeaders("*");
			}
		};
	}

}
