package com.billcom.webservice.endpoint;

import com.billcom.webservice.dto.CustomerDTO;
import com.billcom.webservice.dto.CustomerInfoDTO;
import com.billcom.webservice.service.CustomerService;

public class CustomerSoapService  {
	  private CustomerService customerService;

	    public CustomerSoapService(CustomerService customerService) {
	        this.customerService = customerService;
	    }

	    public CustomerInfoDTO findContactByIdSOAP(Long id) {
	        return customerService.findContactById(id);
	    }  
	    public 	CustomerDTO getContractsByIdSOAP(Long id) {
	        return customerService.getContractsByCustomerId(id);
	    } 
}
