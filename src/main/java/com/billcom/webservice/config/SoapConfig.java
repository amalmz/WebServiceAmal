package com.billcom.webservice.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.billcom.webservice.endpoint.ContractSoapService;
import com.billcom.webservice.endpoint.CustomerSoapService;
import com.billcom.webservice.service.ContractService;
import com.billcom.webservice.service.CustomerService;

@Configuration

public class SoapConfig {
	  @Bean
	    public CustomerSoapService customerSoapService(CustomerService customerService) {
	        return new CustomerSoapService(customerService);
	    }
	  @Bean 
	  public ContractSoapService contractSoapService(ContractService contractService) {
		  return new ContractSoapService(contractService);
		  
	  }
}
