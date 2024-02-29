package com.dsy.dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;
import javax.persistence.Query;

import com.dsy.dto.Company;
import com.dsy.dto.Employye;

public class Company_Employye_Dao {
	private EntityManagerFactory factory = Persistence.createEntityManagerFactory("dev");
	private EntityManager manager = factory.createEntityManager();
	private EntityTransaction transaction = manager.getTransaction();
	
	public void saveCompany(Company company) {
		transaction.begin();
		manager.persist(company);
		transaction.commit();
	}
	public void saveEmployye(Employye employye) {
		transaction.begin();
		manager.persist(employye);
		transaction.commit();
	}
	
	public void updateCompany(Company company) {
		transaction.begin();
		manager.merge(company);
		transaction.commit();
	}
	
	public void updateEmployye(Employye employye) {
		transaction.begin();
		manager.merge(employye);
		transaction.commit();
	}
	public void removeCompanyById(int Id) {
		transaction.begin();
		Company company = manager.find(Company.class, Id);
		manager.remove(company);
		transaction.commit();
	}
	public void removeEmployyeById(int Id) {
		transaction.begin();
		Employye employye = manager.find(Employye.class, Id);
		manager.remove(employye);
		transaction.commit();
	}
	
	public void findCompanyById(int id) {
		Company company =manager.find(Company.class, id);
		System.out.println(company); 
	}
	
	public void findEmployyeById(int id) {
		Employye employye =manager.find(Employye.class, id);
		System.out.println(employye);
	}
	
	public void fetchAllCompany() {
		Query q = manager.createQuery("select a from Company a");
		List<Company> list = q.getResultList();
		for (Company company : list) {
			System.out.println(company);
		}
	}
	
	public void fetchAllEmployye() {
		Query q = manager.createQuery("select a from Computer a");
		List<Employye> list = q.getResultList();
		for (Employye employye : list) {
			System.out.println(employye);
		}
	}

}
