package com.billcom.webservice.service;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.billcom.webservice.model.Contract;
import com.billcom.webservice.model.RatePlan;
import com.billcom.webservice.repository.ContractRepository;
import com.billcom.webservice.dto.ContractRateplanDTO;
import com.billcom.webservice.dto.RatePlanDTO;


@Service
public class ContractServiceImp implements ContractService   {
	
	@Autowired 
	private ContractRepository contractRepository ;
	
	 
	/*public Optional<Contract>findRateplanById(Long id){
		return contractRepository.findRateplanById(id);	
	}*/
	public ContractRateplanDTO getContractRateplanById(Long id) {
	    Optional<Contract> contractOptional = contractRepository.findById(id);
	    if (contractOptional.isPresent()) {
	        Contract contract = contractOptional.get();
	        ContractRateplanDTO contractRateplanDTO = new ContractRateplanDTO();
	        contractRateplanDTO.setId(contract.getId());
	        
	        RatePlan ratePlan = contract.getRatePlan();
	        RatePlanDTO ratePlanDTO = new RatePlanDTO();
	        ratePlanDTO.setId(ratePlan.getId());
	        ratePlanDTO.setDescription(ratePlan.getDescription());
	        
	        contractRateplanDTO.setRatePlan(ratePlanDTO);
	        
	        return contractRateplanDTO;
	    }
	    return null;


	}
	}
