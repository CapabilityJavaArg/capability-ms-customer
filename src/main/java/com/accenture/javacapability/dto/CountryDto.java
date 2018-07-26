package com.accenture.javacapability.dto;

import java.util.List;

public class CountryDto {

	private Long id;
	
	private String name;
	
	private String countryCode;
	
	private List<String> lstCities;
	
	public CountryDto() {
		super();
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

	public String getCountryCode() {
		return countryCode;
	}

	public void setCountryCode(String countryCode) {
		this.countryCode = countryCode;
	}

	public List<String> getLstCities() {
		return lstCities;
	}

	public void setLstCities(List<String> lstCities) {
		this.lstCities = lstCities;
	}
}
