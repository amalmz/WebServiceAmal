package com.billcom.webservice.service;


import com.billcom.webservice.dto.ContractRateplanDTO;

public interface ContractService {
	//Optional<Contract>findRateplanById(Long id);
	ContractRateplanDTO getContractRateplanById(Long id);

}
