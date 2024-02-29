package com.dsy.dto;

import javax.persistence.*;

@Entity
public class Computer {
	@Id
	private int id;
	private String Name;
	@ManyToOne(cascade = CascadeType.ALL)
	@JoinColumn
	private Company company;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return Name;
	}
	public void setName(String name) {
		Name = name;
	}
	public Company getCompany() {
		return company;
	}
	public void setCompany(Company company) {
		this.company = company;
	}
	
	@Override
	public String toString() {
		return "Computer [id=" + id + ", Name=" + Name + ", company=" + company + "]";
	}
	
	

}
