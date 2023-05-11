package com.billcom.webservice.model;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonBackReference;
import com.fasterxml.jackson.annotation.JsonIdentityInfo;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonManagedReference;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.ObjectIdGenerators;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@AllArgsConstructor
@Builder
@Entity
@Table(name="CONTRACT_ALL")
@JsonIgnoreProperties({"hibernateLazyInitializer", "handler"})
//@JsonIdentityInfo(generator = ObjectIdGenerators.PropertyGenerator.class, property = "id")
public class Contract  implements Serializable  {
	private static final long serialVersionUID = 1L;
	 @Id
     @Column(name = "CO_ID")
	 private Long id;
	 @Column(name = "TYPE")
	 private String Type ;
	   
	 @ManyToOne
	 @JoinColumn(name="CUSTOMER_ID",referencedColumnName="CUSTOMER_ID",nullable=false)
	 private Customer customers;
	 
	 @ManyToOne
	 @JoinColumn(name = "TMCODE", nullable = false)
	 @JsonProperty(access=JsonProperty.Access.WRITE_ONLY)
	 private RatePlan ratePlan;
	 
	 public RatePlan getRatePlan() {
		return ratePlan;
	}

	public void setRatePlan(RatePlan ratePlan) {
		this.ratePlan = ratePlan;
	}

	public Customer getCustomers() {
		    return customers;
		}

		public void setCustomers(Customer customers) {
		    this.customers = customers;
		}
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getType() {
		return Type;
	}
	public void setType(String type) {
		this.Type = type;
	}

}
