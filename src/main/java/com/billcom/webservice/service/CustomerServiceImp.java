package com.billcom.webservice.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.billcom.webservice.dto.ContractDTO;
import com.billcom.webservice.dto.CustomerDTO;
import com.billcom.webservice.dto.CustomerInfoDTO;

import com.billcom.webservice.model.Contract;
import com.billcom.webservice.model.Customer;
import com.billcom.webservice.repository.CustomerRepository;
import java.util.ArrayList;

@Service
public class CustomerServiceImp implements CustomerService {
	@Autowired 
	private CustomerRepository customerRepository  ;
	
	public CustomerInfoDTO findContactById(Long id) {
	    Optional<Customer> customerOptional = customerRepository.findInfoById(id);
	    if (customerOptional.isPresent()) {
	        Customer customer = customerOptional.get();
	        CustomerInfoDTO customerDTO = new CustomerInfoDTO();
	        customerDTO.setId(customer.getCustomerId());
	        customerDTO.setContact(customer.getContact());
	        return customerDTO;
	    }
	    return null;
	}
	
	public Customer getCustomerbyId(Long id){
		return customerRepository.findById(id).orElseThrow();
	}
	public List<Customer> getAllCustomer(){
		return customerRepository.findAll();
	}
 
	public CustomerDTO getContractsByCustomerId(Long id) {
		  Optional<Customer> customerOptional = customerRepository.findContractById(id);
		    if (customerOptional.isPresent()) {
		        Customer customer = customerOptional.get();
		        CustomerDTO customerDTO = new CustomerDTO();
		        customerDTO.setId(customer.getCustomerId());
		        customerDTO.setCstype(customer.getCSTYPE());
		        customerDTO.setCustcode(customer.getCUSTCODE());
		        
		        List<ContractDTO> contractDTOs = new ArrayList<>();
		        for (Contract contract : customer.getContracts()) {
		        	ContractDTO contractDTO = new ContractDTO();
		            contractDTO.setId(contract.getId());
		            contractDTO.setType(contract.getType());
		            contractDTOs.add(contractDTO);

		        }
		        
		        customerDTO.setContracts(contractDTOs);
		        return customerDTO;
		    }
		    return null;
    
		
	}
	

	

}
