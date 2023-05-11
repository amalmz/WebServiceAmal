package com.billcom.webservice.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.billcom.webservice.endpoint.CustomerSoapService;
import com.billcom.webservice.service.CustomerService;

@Configuration

public class SoapConfig {
	  @Bean
	    public CustomerSoapService customerSoapService(CustomerService customerService) {
	        return new CustomerSoapService(customerService);
	    }
}
