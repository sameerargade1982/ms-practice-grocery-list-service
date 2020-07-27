package com.argade.mspracticegrocerylistservice.controllers;

import java.security.Principal;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.oauth2.server.resource.authentication.JwtAuthenticationToken;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.argade.mspracticegrocerylistservice.clients.ItemsWebClient;
import com.argade.mspracticegrocerylistservice.feignclients.ItemServiceClient;

@RestController
public class HomeController {
	private final static Logger log = LoggerFactory.getLogger(HomeController.class);

//	@Autowired
//	ItemsWebClient itemsWebClient;
	
	@Autowired
	ItemServiceClient itemsServiceClient;

	@GetMapping("/groceryhome")
	public String howdy(Principal principal) {
		String username = principal.getName();
		JwtAuthenticationToken token = (JwtAuthenticationToken) principal;
		log.info("claims: " + token.getTokenAttributes());
		String ambition =  itemsServiceClient.getHome(); //itemsWebClient.getHomeFromItems();
		
		return "Hello, " + username + " You are at Grocery Home " + ambition;
	}
}
