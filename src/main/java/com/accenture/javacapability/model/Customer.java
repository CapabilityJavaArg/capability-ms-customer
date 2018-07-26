package com.accenture.javacapability.model;

public class Customer {
	
	private Long id;
	
	private String name;
	
	private String lastName;
	
	private Long countryRef;
	
	public Customer() {
		super();
	}

	public Customer(Long id, String name, String lastName, Long countryRef) {
		super();
		this.id = id;
		this.name = name;
		this.lastName = lastName;
		this.countryRef = countryRef;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public Long getCountryRef() {
		return countryRef;
	}

	public void setCountryRef(Long countryRef) {
		this.countryRef = countryRef;
	}
	
	
}
