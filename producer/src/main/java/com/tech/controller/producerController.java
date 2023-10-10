package com.tech.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.tech.Entity.Customer;

@RestController
public class producerController {

    @RequestMapping("/get")
	public List loginProduce()
	{
    	
    	System.out.println("Insie controller");
		
		Customer c = new Customer();
		c.setCid(101);
		c.setcName("Asha");
		c.setAddr("Pune");
		
		
		Customer c1 = new Customer();
		c1.setCid(102);
		c1.setcName("Rani");
		c1.setAddr("Pune");
		
		List<Customer> plist=  new ArrayList<Customer>();
		plist.add(c);
		plist.add(c1);
		
	
		return plist;
	}
}
