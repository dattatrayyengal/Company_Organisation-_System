package com.dsy.dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;
import javax.persistence.Query;

import com.dsy.dto.Address;
import com.dsy.dto.Company;

public class Company_Address_Dao {
	private EntityManagerFactory factory = Persistence.createEntityManagerFactory("dev");
	private EntityManager manager = factory.createEntityManager();
	private EntityTransaction transaction = manager.getTransaction();
	
	public void saveCompany(Company company) {
		transaction.begin();
		manager.persist(company);
		transaction.commit();
	}
	public void saveAddress(Address address) {
		transaction.begin();
		manager.persist(address);
		transaction.commit();
	}
	
	public void updateCompany(Company company) {
		transaction.begin();
		manager.merge(company);
		transaction.commit();
	}
	
	public void updateAddress(Address address) {
		transaction.begin();
		manager.merge(address);
		transaction.commit();
	}
	public void removeCompanyById(int Id) {
		transaction.begin();
		Company company = manager.find(Company.class, Id);
		manager.remove(company);
		transaction.commit();
	}
	public void removeAddressById(int Id) {
		transaction.begin();
		Address address = manager.find(Address.class, Id);
		manager.remove(address);
		transaction.commit();
	}
	
	public void findCompanyById(int id) {
		Company company =manager.find(Company.class, id);
		System.out.println(company); 
	}
	
	public void findAddressById(int id) {
		Address address =manager.find(Address.class, id);
		System.out.println(address);
	}
	
	public void fetchAllCompany() {
		Query q = manager.createQuery("select a from Company a");
		List<Company> list = q.getResultList();
		for (Company company : list) {
			System.out.println(company);
		}
	}
	
	public void fetchAllAddress() {
		Query q = manager.createQuery("select a from Address a");
		List<Address> list = q.getResultList();
		for (Address address : list) {
			System.out.println(address);
		}
	}

}
