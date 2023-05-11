package com.billcom.webservice.dto;

import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@AllArgsConstructor
public class ContractRateplanDTO {
	  private Long id;
      private RatePlanDTO ratePlan ;
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public RatePlanDTO getRatePlan() {
		return ratePlan;
	}
	public void setRatePlan(RatePlanDTO ratePlan) {
		this.ratePlan = ratePlan;
	}
      
      
      
}
