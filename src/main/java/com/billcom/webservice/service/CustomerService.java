package com.billcom.webservice.service;

import java.util.List;

import com.billcom.webservice.dto.CustomerDTO;
import com.billcom.webservice.dto.CustomerInfoDTO;
import com.billcom.webservice.model.Customer;


public interface CustomerService {
	CustomerInfoDTO findContactById(Long id);
	Customer getCustomerbyId(Long id);
	List<Customer> getAllCustomer();
	CustomerDTO getContractsByCustomerId(Long id);
}
