package com.argade.mspracticegrocerylistservice.feignclients;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@FeignClient(value="itemsservice",url="http://localhost:9555")
public interface ItemServiceClient {
	@RequestMapping(
			method= RequestMethod.GET,
			value="/home",
			consumes="application/json")
			public String getHome();
}
