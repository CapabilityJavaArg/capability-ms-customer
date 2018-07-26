package com.accenture.javacapability.backbone.model;

import static org.junit.Assert.assertNotNull;

import org.junit.Test;
import org.meanbean.test.BeanTester;

import com.accenture.javacapability.model.Customer;

public class CustomerTest {

	@Test
	public void countryTest() {
		BeanTester beanTester = new BeanTester();
		beanTester.testBean(Customer.class);
	}
	
	@Test
	public void countryTest2() {
		Customer country = new Customer(1L, "Juan", "Perez", 1L);
		assertNotNull(country);
	}
}
