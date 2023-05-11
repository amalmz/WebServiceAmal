package com.billcom.webservice.endpoint;

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
}
