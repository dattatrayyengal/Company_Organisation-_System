package com.dsy.dto;

import javax.persistence.*;

@Entity
public class Skills {
	@Id
	private int Sid;
	private String Sname;
	@ManyToOne(cascade = CascadeType.ALL)
	private Employye employye;
	public int getSid() {
		return Sid;
	}
	public void setSid(int sid) {
		Sid = sid;
	}
	public String getSname() {
		return Sname;
	}
	public void setSname(String sname) {
		Sname = sname;
	}
	public Employye getEmployye() {
		return employye;
	}
	public void setEmployye(Employye employye) {
		this.employye = employye;
	}
	@Override
	public String toString() {
		return "Skills [Sid=" + Sid + ", Sname=" + Sname + ", employye=" + employye + "]";
	}
	

}
