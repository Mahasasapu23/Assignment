package org.springframework.spring_context;

import org.springframework.stereotype.Component;

@Component
public class AadharCard {
     private String aadharNo;
     private String city;
     private String state;
	public AadharCard() {}
	public AadharCard(String aadharNo, String city, String state) {
		this.aadharNo = aadharNo;
		this.city = city;
		this.state = state;
	}
	public String getAadharNo() {
		return aadharNo;
	}
	public void setAadharNo(String aadharNo) {
		this.aadharNo = aadharNo;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public String getState() {
		return state;
	}
	public void setState(String state) {
		this.state = state;
	}
}
	