package com.accenture.javacapability.backbone.service.interfaces;

import java.util.List;

import com.accenture.javacapability.dto.CountryDto;
import com.accenture.javacapability.model.Customer;

public interface ICustomerService {

	public List<Customer> generateMockData();
	
	public Customer getCustomer(Long id);
	
	public CountryDto getCountryFromMsLocalization(Long id);
}
