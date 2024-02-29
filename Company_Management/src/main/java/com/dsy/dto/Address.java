package com.dsy.dto;

import javax.persistence.*;

@Entity
public class Address {
	@Id
	private int aid;
	private String addree;
	@OneToOne(cascade = CascadeType.ALL)
	private Company company;
	public int getAid() {
		return aid;
	}
	public void setAid(int aid) {
		this.aid = aid;
	}
	public String getAddree() {
		return addree;
	}
	public void setAddree(String addree) {
		this.addree = addree;
	}
	public Company getCompany() {
		return company;
	}
	public void setCompany(Company company) {
		this.company = company;
	}
	
	@Override
	public String toString() {
		return "Address [aid=" + aid + ", addree=" + addree + ", company=" + company + "]";
	}
	
	

}
