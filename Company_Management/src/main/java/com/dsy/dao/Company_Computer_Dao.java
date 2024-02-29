package com.dsy.dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;
import javax.persistence.Query;

import com.dsy.dto.Company;
import com.dsy.dto.Computer;

public class Company_Computer_Dao {
	private EntityManagerFactory factory = Persistence.createEntityManagerFactory("dev");
	private EntityManager manager = factory.createEntityManager();
	private EntityTransaction transaction = manager.getTransaction();
	
	public void saveCompany(Company company) {
		transaction.begin();
		manager.persist(company);
		transaction.commit();
	}
	public void saveComputer(Computer computer) {
		transaction.begin();
		manager.persist(computer);
		transaction.commit();
	}
	
	public void updateCompany(Company company) {
		transaction.begin();
		manager.merge(company);
		transaction.commit();
	}
	
	public void updateComputer(Computer computer) {
		transaction.begin();
		manager.merge(computer);
		transaction.commit();
	}
	public void removeCompanyById(int Id) {
		transaction.begin();
		Company company = manager.find(Company.class, Id);
		manager.remove(company);
		transaction.commit();
	}
	public void removeComputerById(int Id) {
		transaction.begin();
		Computer computer = manager.find(Computer.class, Id);
		manager.remove(computer);
		transaction.commit();
	}
	
	public void findCompanyById(int id) {
		Company company =manager.find(Company.class, id);
		System.out.println(company); 
	}
	
	public void findComputerById(int id) {
		Computer computer =manager.find(Computer.class, id);
		System.out.println(computer);
	}
	
	public void fetchAllCompany() {
		Query q = manager.createQuery("select a from Company a");
		List<Company> list = q.getResultList();
		for (Company company : list) {
			System.out.println(company);
		}
	}
	
	public void fetchAllComputer() {
		Query q = manager.createQuery("select a from Computer a");
		List<Computer> list = q.getResultList();
		for (Computer computer : list) {
			System.out.println(computer);
		}
	}

}
