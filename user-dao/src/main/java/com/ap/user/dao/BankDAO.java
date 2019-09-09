package com.ap.user.dao;

import org.hibernate.Session;
import org.hibernate.Transaction;

import com.ap.user.entity.Bank;
import com.ap.user.util.HibernateUtil;

public class BankDAO {
	
	public Bank getBank(int id) {
		return null;
	}

	public void addBank(Bank bank) {
		
		Session session = HibernateUtil.getSessionFactory().openSession();
		Transaction trx = session.beginTransaction();
		session.save(bank);
		trx.commit();
		session.close();
	}
	
	public void updateBank(Bank bank) {
		
	}
	
	public void deleteBank(int id) {
		
	}
}
