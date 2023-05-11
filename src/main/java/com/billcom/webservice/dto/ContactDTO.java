package com.billcom.webservice.dto;

import com.billcom.webservice.model.Contact;

import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@AllArgsConstructor
public class ContactDTO {
	   private Long ccseq;
	   private String ccfname ;
	   private String cclname ;
	   private String ccadd1 ;
	   

	public ContactDTO() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Long getCcseq() {
		return ccseq;
	}
	public void setCcseq(Long ccseq) {
		this.ccseq = ccseq;
	}
	public String getCcfname() {
		return ccfname;
	}
	public void setCcfname(String ccfname) {
		this.ccfname = ccfname;
	}
	public String getCclname() {
		return cclname;
	}
	public void setCclname(String cclname) {
		this.cclname = cclname;
	}
	public String getCcadd1() {
		return ccadd1;
	}
	public void setCcadd1(String ccadd1) {
		this.ccadd1 = ccadd1;
	}
	
	 public static ContactDTO fromContact(Contact contact) {
	        ContactDTO contactDTO = new ContactDTO();
	        contactDTO.setCcadd1(contact.getCCADDR1());
	        contactDTO.setCcfname(contact.getCCFNAME());
	        contactDTO.setCclname(contact.getCCLNAME());
	        contactDTO.setCcseq(contact.getCCSEQ());
	        return contactDTO;
	    }



}
