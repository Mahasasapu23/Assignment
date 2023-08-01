package org.springframework.spring_context;

import org.springframework.beans.factory.annotation.Autowired;

public class Citizen {
	private int sno;
	private String name;
	private int age;
	@Autowired
	private AadharCard aadharcard;
	public Citizen() {}
	public Citizen(AadharCard aadharcard) {
		this.aadharcard=aadharcard;
	}
	public Citizen(int sno, String name, int age, AadharCard aadharcard) {
		this.sno = sno;
		this.name = name;
		this.age = age;
		this.aadharcard = aadharcard;
	}
	public int getSno() {
		return sno;
	}
	public void setSno(int sno) {
		this.sno = sno;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public AadharCard getAadharcard() {
		return aadharcard;
	}
	public void setAadharcard(AadharCard aadharcard) {
		this.aadharcard = aadharcard;
	}
	
}
