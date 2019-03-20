package com.lms;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
//public class Application extends SpringServletContainerInitializer{
public class Application {
	public static void main(String[] args)
	{
		SpringApplication.run(Application.class, args);
			
	}
/*		public SpringApplicationBuilder configure(SpringApplicationBuilder builder)
		{
			return builder.sources(applicationClass);
		}
		
		private static Class<Application> applicationClass = Application.class;  
		
*/	}

