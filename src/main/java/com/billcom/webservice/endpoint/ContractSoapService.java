package com.billcom.webservice.endpoint;


import com.billcom.webservice.dto.ContractRateplanDTO;
import com.billcom.webservice.service.ContractService;


public class ContractSoapService {
	
	private ContractService contractService ; 
	 public ContractSoapService(ContractService contractService) {
	        this.contractService = contractService;
	    }
	 public ContractRateplanDTO getRateplanById(Long id) {
		 return contractService.getContractRateplanById(id);
	 }

}
