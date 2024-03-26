package com.AroundU.aroundU.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="serviceProvider")
public class ServiceProvider {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name="serviceProviderid")
	private Integer serviceprovider_id;
	private String name;
	private String service;
	private String qualification;
	private String rating;
	private String availibility;
	
	public ServiceProvider() {
		super();
	}
	public ServiceProvider(int serviceprovider_id, String name, String service, String qualification, String rating,
			String availibility) {
		super();
		this.serviceprovider_id = serviceprovider_id;
		this.name = name;
		this.service = service;
		this.qualification = qualification;
		this.rating = rating;
		this.availibility = availibility;
	}
	public int getServiceprovider_id() {
		return serviceprovider_id;
	}
	public void setServiceprovider_id(int serviceprovider_id) {
		this.serviceprovider_id = serviceprovider_id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getService() {
		return service;
	}
	public void setService(String service) {
		this.service = service;
	}
	public String getQualification() {
		return qualification;
	}
	public void setQualification(String qualification) {
		this.qualification = qualification;
	}
	public String getRating() {
		return rating;
	}
	public void setRating(String rating) {
		this.rating = rating;
	}
	public String getAvailibility() {
		return availibility;
	}
	public void setAvailibility(String availibility) {
		this.availibility = availibility;
	}
	
	
	
	
	

}
