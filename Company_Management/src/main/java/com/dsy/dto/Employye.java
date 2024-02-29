package com.dsy.dto;

import java.util.List;

import javax.persistence.*;

@Entity
public class Employye {
	@Id
	private int Eid;
	private String Ename;
	@ManyToOne(cascade = CascadeType.ALL)
	private Company company;
	@OneToMany(cascade = CascadeType.ALL)
	private List<Skills> skills;
	public int getEid() {
		return Eid;
	}
	public void setEid(int eid) {
		Eid = eid;
	}
	public String getEname() {
		return Ename;
	}
	public void setEname(String ename) {
		Ename = ename;
	}
	public Company getCompany() {
		return company;
	}
	public void setCompany(Company company) {
		this.company = company;
	}
	
	public List<Skills> getSkills() {
		return skills;
	}
	public void setSkills(List<Skills> skills) {
		this.skills = skills;
	}
	
	@Override
	public String toString() {
		return "Employye [Eid=" + Eid + ", Ename=" + Ename + ", company=" + company + ", skills=" + skills + "]";
	}
	

}
