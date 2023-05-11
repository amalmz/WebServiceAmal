package com.billcom.webservice.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.billcom.webservice.dto.CustomerDTO;
import com.billcom.webservice.dto.CustomerInfoDTO;
import com.billcom.webservice.endpoint.CustomerSoapService;
import com.billcom.webservice.model.Customer;
import com.billcom.webservice.service.CustomerService;

@RestController 
@RequestMapping("/customer")
public class CustomerController {
	@Autowired 
	private CustomerService customerService ;
	@Autowired
    private CustomerSoapService customerSoapService;

	@GetMapping("/info/{id}")
	public  CustomerInfoDTO findContactById(@PathVariable("id") Long id) {
		return customerService.findContactById(id);}
	
	@GetMapping("/{id}")
	public Customer CustomerById(@PathVariable("id") Long id) {
		return customerService.getCustomerbyId(id);
	}
	@GetMapping("/all")
	public List<Customer> getAllCustumers() {
		return customerService.getAllCustomer();
	}
	@GetMapping("contracts/{id}")
	public CustomerDTO getContractsByCustomerId(@PathVariable("id") Long id){
		return customerService.getContractsByCustomerId(id);
	}
	  @GetMapping(value = "/soap/{id}", produces = "application/xml")
	    public CustomerInfoDTO findContactByIdSOAP(@PathVariable("id") Long id) {
	       return customerSoapService.findContactByIdSOAP(id);
	  }

}
