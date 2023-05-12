package com.billcom.webservice.model;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.*;


import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@AllArgsConstructor
@Builder
@Entity
@Table(name="RATEPLAN")
@JsonIgnoreProperties({"hibernateLazyInitializer", "handler"})
public class RatePlan {
	 @Id
     @Column(name = "TMCODE")
	 private Long id;
	 @Column(name = "DES")
	 private String Description ;
	 
     @OneToMany(mappedBy = "ratePlan", fetch = FetchType.EAGER, cascade = CascadeType.ALL)
	 @JsonProperty(access=JsonProperty.Access.WRITE_ONLY)
	 private List<Contract> contracts;
	 
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getDescription() {
		return Description;
	}
	public void setDescription(String description) {
		Description = description;
	}
	 

}
