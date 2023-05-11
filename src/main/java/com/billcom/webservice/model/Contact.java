package com.billcom.webservice.model;

import java.io.Serializable;

import javax.persistence.*;

import com.fasterxml.jackson.annotation.JsonBackReference;
import com.fasterxml.jackson.annotation.JsonIdentityInfo;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonManagedReference;
import com.fasterxml.jackson.annotation.ObjectIdGenerators;

import lombok.*;

@NoArgsConstructor
@AllArgsConstructor
@Builder
@Entity
@Table(name="CCONTACT_ALL")
//@JsonIdentityInfo(generator = ObjectIdGenerators.PropertyGenerator.class, property = "ccseq")
@JsonIgnoreProperties({"hibernateLazyInitializer", "handler"})
public class Contact  implements Serializable {
	private static final long serialVersionUID = 1L;
       @Id
       @Column(name = "CCSEQ")
  	   private Long ccseq;
	   @Column(name = "CCFNAME")
	   private String CCFNAME ;
	   @Column(name = "CCLNAME")
	   private String CCLNAME; 
	   @Column(name = "CCADDR1")
	   private String CCADDR1; 
	   @Column(name = "CSTYPE")
	   private String CSTYPE;
	   
	   @OneToOne
	   @JoinColumn(name = "CUSTOMER_ID",referencedColumnName="CUSTOMER_ID", insertable=false, updatable=false)
	   private Customer customer;
	   
	public Long getCCSEQ() {
		return ccseq;
	}
	public void setCCSEQ(Long cCSEQ) {
		ccseq = cCSEQ;
	}
	public String getCCFNAME() {
		return CCFNAME;
	}
	public void setCCFNAME(String cCFNAME) {
		CCFNAME = cCFNAME;
	}
	public String getCCLNAME() {
		return CCLNAME;
	}
	public void setCCLNAME(String cCLNAME) {
		CCLNAME = cCLNAME;
	}
	public String getCCADDR1() {
		return CCADDR1;
	}
	public void setCCADDR1(String cCADDR1) {
		CCADDR1 = cCADDR1;
	}
	public Customer getCustomer() {
		return customer;
	}
	public void setCustomer(Customer customer) {
		this.customer = customer;
	}
	public String getCSTYPE() {
		return CSTYPE;
	}
	public void setCSTYPE(String cSTYPE) {
		CSTYPE = cSTYPE;
	}
}
