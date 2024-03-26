package com.AroundU.aroundU.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.AroundU.aroundU.entity.ServiceProvider;

public interface Aroundurepository extends JpaRepository<ServiceProvider,Integer>{
	@Query("SELECT p FROM ServiceProvider p WHERE " + "p.name LIKE CONCAT('%', :query, '%') OR " + "p.service LIKE CONCAT('%', :query, '%')")
	List<ServiceProvider> searchprovider(String query);

}

