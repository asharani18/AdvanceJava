package com.tech.consumer;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.web.client.RestTemplate;

@SpringBootApplication
public class ConsumerApplication {

	public static void main(String[] args) {
		SpringApplication.run(ConsumerApplication.class, args);
		
		System.out.println(" hello web service (Consumer) ");
	}
	
		 @Bean
		 public RestTemplate restTemp()
		{
			RestTemplate rs = new RestTemplate();
			
			return rs;
			
			
		
	}

}
