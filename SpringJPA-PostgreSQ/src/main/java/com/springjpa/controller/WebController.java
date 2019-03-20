package com.springjpa.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.springjpa.model.Customer;
import com.springjpa.repo.CustomerRepository;

@RestController
public class WebController {

	@Autowired
	CustomerRepository repository;

	@RequestMapping(name = "/save", consumes = "application/json", method = RequestMethod.POST)
	public String process(@RequestBody Customer customer) {
		// save a single Customer
		repository.save(customer);

		// save a list of Customers
		// repository.save(Arrays.asList(new Customer("Adam", "Johnson"), new
		// Customer("Kim", "Smith"),new Customer("David", "Williams"), new
		// Customer("Peter", "Davis")));

		return "the data has been saved to database ! Done and Customer = "+customer;
	}

	@RequestMapping("/findall")
	public String findAll() {
		String result = "";

		for (Customer cust : repository.findAll()) {
			result += cust.toString() + "<br>";
		}

		return result;
	}

	@RequestMapping("/findbyid")
	public String findById(@RequestParam("id") long id) {
		String result = "";
		result = repository.findOne(id).toString();
		return result;
	}

	@RequestMapping("/findbylastname")
	public String fetchDataByLastName(@RequestParam("lastname") String lastName) {
		String result = "";

		for (Customer cust : repository.findByLastName(lastName)) {
			result += cust.toString() + "<br>";
		}

		return result;
	}
}
