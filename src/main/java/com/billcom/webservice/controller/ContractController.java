package com.billcom.webservice.controller;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.billcom.webservice.dto.ContractRateplanDTO;
import com.billcom.webservice.endpoint.ContractSoapService;
import com.billcom.webservice.service.ContractService;

@RestController 
@RequestMapping("/contracts")
public class ContractController {
	@Autowired 
	private ContractService contractService ;
	@Autowired 
	private ContractSoapService contractSoapService ; 
	
	@GetMapping("/rateplan/{id}")
	ContractRateplanDTO getContractRateplanById(@PathVariable("id")Long id){
		return contractService.getContractRateplanById(id);
	}
	@GetMapping(value="soap/rateplan/{id}", produces = "application/xml")
	 public ContractRateplanDTO getRateplanById(@PathVariable("id")Long id) {
		return contractSoapService.getRateplanById(id); 
	}
	

}
