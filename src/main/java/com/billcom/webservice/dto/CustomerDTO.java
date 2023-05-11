package com.billcom.webservice.dto;

import java.util.List;
import java.util.Set;

import com.billcom.webservice.model.Contract;

import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;
@NoArgsConstructor
@AllArgsConstructor
public class CustomerDTO {
    private Long id;
    private String cstype;
    private String custcode;
    private List<ContractDTO> contracts;
    
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getCstype() {
		return cstype;
	}
	public void setCstype(String cstype) {
		this.cstype = cstype;
	}
	public String getCustcode() {
		return custcode;
	}
	public void setCustcode(String custcode) {
		this.custcode = custcode;
	}
	public List<ContractDTO> getContracts() {
		return contracts;
	}
	public void setContracts(List<ContractDTO> contractDTOs) {
		this.contracts = contractDTOs;
	}
}
