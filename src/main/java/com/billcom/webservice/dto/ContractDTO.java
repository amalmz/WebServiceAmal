package com.billcom.webservice.dto;

public class ContractDTO {
	  private Long id;
	  private String type;
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	public ContractDTO(Long id, String type) {
		super();
		this.id = id;
		this.type = type;
	}
	public ContractDTO() {
		super();
		// TODO Auto-generated constructor stub
	}
	  
}
