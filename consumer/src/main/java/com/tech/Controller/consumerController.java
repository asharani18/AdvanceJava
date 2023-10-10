package com.tech.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@RestController
public class consumerController {

	  @Autowired
	  RestTemplate rtemp;
		 
	  
	  @RequestMapping("/consumer/get")
		public List getService()
		{
			String url = "http://localhost:8081/producer/get";
			
			List clist = rtemp.getForObject(url, List.class);
			
			return clist;
			
		}
		
		 
	
	
}
