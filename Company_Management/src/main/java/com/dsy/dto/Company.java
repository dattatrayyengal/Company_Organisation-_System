package com.dsy.dto;

import java.util.List;

import javax.persistence.*;

@Entity
public class Company {
	@Id
	private int id;
	private String Name;
	@OneToMany(cascade = CascadeType.ALL,mappedBy = "company")
	private List<Computer> computer;
	@OneToOne(cascade = CascadeType.ALL)
	private Address address;
	@OneToMany(cascade = CascadeType.ALL)
	private List<Employye> Employye;
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
	public List<Computer> getComputer() {
		return computer;
	}
	public void setComputer(List<Computer> computer) {
		this.computer = computer;
	}
	
	public Address getAddress() {
		return address;
	}
	public void setAddress(Address address) {
		this.address = address;
	}
	public List<Employye> getEmployye() {
		return Employye;
	}
	public void setEmployye(List<Employye> employye) {
		Employye = employye;
	}
	
	@Override
	public String toString() {
		return "Company [id=" + id + ", Name=" + Name  + ", address=" + address
				+ ", Employye=" + Employye + "]";
	}
	
	

}
