package com.billcom.webservice.dto;

import com.billcom.webservice.model.Contact;

import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@AllArgsConstructor
public class CustomerInfoDTO {
	 private Long id;
	 private  ContactDTO contact;
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	  public ContactDTO getContact() {
	        return contact;
	    }
	    
	 public void setContact(Contact contact) {
	    this.contact = ContactDTO.fromContact(contact);
	  }
	 
}
