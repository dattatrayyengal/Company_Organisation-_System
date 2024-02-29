package com.dsy.contrller;

import java.util.ArrayList;
import java.util.List;

import com.dsy.dao.Company_Address_Dao;
import com.dsy.dao.Company_Computer_Dao; 
import com.dsy.dto.*;


public class Driver1 {
	public static void main(String[] args) {
		Company company = new Company();
		company.setId(10);
		company.setName("Dattatray'sCompany");
		
//		Computer computer = new Computer();
//		computer.setId(1003);
//		computer.setName("Linux");
		Address a = new Address();
		a.setAid(100);
		a.setAddree("abc");
		a.setCompany(company);
		company.setAddress(a);
		
//		List<Computer> list = new ArrayList<Computer>();
//		list.add(computer);
//		company.setComputer(list);
//		computer.setCompany(company);
		
		Company_Computer_Dao d = new Company_Computer_Dao();
//		d.fetchAllCompany();
//		d.fetchAllComputer();
//		d.updateCompany(company);
//		d.updateComputer(computer);
//		d.saveCompany(company);
//		d.saveComputer(computer);
		
		Company_Address_Dao d1 = new Company_Address_Dao();
//		d1.saveCompany(company);
//		d1.saveAddress(a);
//		d1.findAddressById(100);
		d1.findCompanyById(10);
		
	}

}
