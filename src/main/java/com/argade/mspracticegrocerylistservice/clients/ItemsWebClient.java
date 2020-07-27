package com.argade.mspracticegrocerylistservice.clients;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpMethod;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Component;

import org.springframework.security.oauth2.client.OAuth2RestTemplate;

//@Component
public class ItemsWebClient {
// unfortunately doesn't support zuul	
//	@Autowired 
//    WebClient webClient;
//	
//	public String getHomeFromItems() {
//		return this.webClient
//	            .get()
//	            .uri("http://localhost:9555" + "/home")
//	            .retrieve()
//	            .bodyToMono(String.class)
//	            .block();
//	}
	
//	@Autowired
//    OAuth2RestTemplate restTemplate;
//	
//	public String getHomeFromItems() {
//		 ResponseEntity<String> restExchange =
//	                restTemplate.exchange(
//	                        "http://localhost:9555/home",
//	                        HttpMethod.GET,
//	                        null, String.class);
//		 return restExchange.getBody();
//
//	}
}
