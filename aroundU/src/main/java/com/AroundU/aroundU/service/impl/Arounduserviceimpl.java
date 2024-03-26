package com.AroundU.aroundU.service.impl;
import java.util.List;
import org.springframework.stereotype.Service;

import com.AroundU.aroundU.entity.ServiceProvider;
import com.AroundU.aroundU.repository.Aroundurepository;
import com.AroundU.aroundU.service.Arounduservice;

@Service
public class Arounduserviceimpl implements Arounduservice{
	
   private Aroundurepository aroundurepository;

public Arounduserviceimpl(Aroundurepository aroundurepository) {
	
	this.aroundurepository = aroundurepository;
}

@Override
public List<ServiceProvider> searchprovider(String query) {
	// TODO Auto-generated method stub
	
	List<ServiceProvider> providerList=aroundurepository.searchprovider(query);
	return  providerList;
}
   
   

	
   

}



	
	
	
//
//	@Override
//	public List<Product> searchProduct(String query) {
//		// TODO Auto-generated method stub
//		List<Product>product=productRepository.searchProduct(query);
//		return  product;
//	}
//
//
//





