package com.accenture.javacapability.backbone.service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Service;

import com.accenture.javacapability.backbone.service.interfaces.ICustomerService;
import com.accenture.javacapability.dto.CountryDto;
import com.accenture.javacapability.model.Customer;

@Service("customerService")
public class CustomerService implements ICustomerService {

	private static List<Customer> lstCustomer=new ArrayList<>();
	
	@Override
	public List<Customer> generateMockData() {
		
		Customer c1 = new Customer(1L, "Juan", "Perez", 1L);
		Customer c2 = new Customer(2L, "Arturo", "Gomez", 2L);
		Customer c3 = new Customer(3L, "Edson Arantes", "do Nascimento", 3L);
		
		lstCustomer.add(c1);
		lstCustomer.add(c2);
		lstCustomer.add(c3);
		return lstCustomer;
	}

	@Override
	public Customer getCustomer(Long id) {
		Optional<Customer> optCustomer = lstCustomer.parallelStream().filter(c->c.getId().equals(id)).findFirst();
		
		if(optCustomer.isPresent())
			return optCustomer.get();
		
		return null;
	}

	@Override
	public CountryDto getCountryFromMsLocalization(Long id) {
		// TODO Auto-generated method stub
		return null;
	}

}
