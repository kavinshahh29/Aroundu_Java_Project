package com.AroundU.aroundU.controller;
import java.util.List;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.AroundU.aroundU.entity.ServiceProvider;
import com.AroundU.aroundU.service.Arounduservice;
@RestController
@RequestMapping("/api/v1/providers")
public class ArounduController {
	
	
	private Arounduservice arounduservice;
	
	public ArounduController(Arounduservice arounduservice)
	{
		this.arounduservice=arounduservice;
	}
	
	

	@GetMapping("/search")
	public ResponseEntity<List<ServiceProvider>>searchprovider(@RequestParam("query")String query){
		
		System.out.println("Query: "+ query);
		return ResponseEntity.ok(arounduservice.searchprovider(query));
	}
	
	

}


