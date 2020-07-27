package com.argade.mspracticegrocerylistservice;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
@EnableDiscoveryClient
@SpringBootApplication
public class MsPracticeGroceryListServiceApplication {

	public static void main(String[] args) {
		SpringApplication.run(MsPracticeGroceryListServiceApplication.class, args);
	}

}
