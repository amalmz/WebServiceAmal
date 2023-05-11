package com.billcom.webservice.controller;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.billcom.webservice.dto.ContractRateplanDTO;
import com.billcom.webservice.model.Contract;
import com.billcom.webservice.service.ContractService;

@RestController 
@RequestMapping("/contracts")
public class ContractController {
	@Autowired 
	private ContractService contractService ; 
	
	@GetMapping("/rateplan/{id}")
	ContractRateplanDTO getContractRateplanById(@PathVariable("id")Long id){
		return contractService.getContractRateplanById(id);
	}
	

}
