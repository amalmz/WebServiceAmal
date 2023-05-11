package com.billcom.webservice.service;

import java.util.Optional;

import com.billcom.webservice.dto.ContractRateplanDTO;
import com.billcom.webservice.model.Contract;

public interface ContractService {
	//Optional<Contract>findRateplanById(Long id);
	ContractRateplanDTO getContractRateplanById(Long id);

}
