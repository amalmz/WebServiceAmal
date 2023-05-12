package com.billcom.webservice.model;

import java.io.Serializable;
import java.util.List;

import javax.persistence.*;

import com.fasterxml.jackson.annotation.*;


import lombok.*;


@NoArgsConstructor
@AllArgsConstructor
@Builder
@Entity
@Table(name="CUSTOMER_ALL")
@JsonIgnoreProperties({"hibernateLazyInitializer", "handler"})
//@JsonIdentityInfo(generator = ObjectIdGenerators.PropertyGenerator.class, property = "CUSTOMER_ID")
public class Customer implements Serializable {
	private static final long serialVersionUID = 1L;
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	//@JsonProperty("CUSTOMER_ID")
    @Column(name = "CUSTOMER_ID")
    private Long CUSTOMER_ID;
    
	@Column(name = "CUSTCODE")
    private String CUSTCODE;
    
	@Column(name = "CSTYPE")
    private String CSTYPE ; 
	
	@OneToOne(mappedBy = "customer", cascade = CascadeType.ALL)
    private Contact contact;
	
	@OneToMany(mappedBy = "customers", fetch = FetchType.EAGER, cascade = CascadeType.ALL)
	private List<Contract> contracts;
    
    public Contact getContact() {
		return contact;
	}
	public void setContact(Contact contact) {
		this.contact = contact;
	}
    
	public List<Contract> getContracts() {
		return contracts;
	}
	public void setContracts(List<Contract> contracts) {
		this.contracts = contracts;
	}
	public Long getCustomerId() {
		return CUSTOMER_ID;
	}
	public void setCustomerId(Long CUSTOMER_ID) {
		this.CUSTOMER_ID = CUSTOMER_ID;
	}
	public String getCSTYPE() {
		return CSTYPE;
	}
	public void setCSTYPE(String cSTYPE) {
		CSTYPE = cSTYPE;
	}
  	public String getCUSTCODE() {
  		return CUSTCODE;
  	}
  	public void setCUSTCODE(String Custcode) {
  		CUSTCODE = Custcode;
  	}
  	
}
