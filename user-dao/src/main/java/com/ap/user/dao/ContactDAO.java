package com.ap.user.dao;

import org.hibernate.Session;
import org.hibernate.Transaction;

import com.ap.user.entity.Contact;
import com.ap.user.util.HibernateUtil;

public class ContactDAO {
	
	public Contact getContact(int id) {
		return null;
	}
	
	public void addContact(Contact contact) {
		
		Session session = HibernateUtil.getSessionFactory().openSession();
		Transaction trx = session.beginTransaction();
		session.save(contact);
		trx.commit();
		session.close();
	}
	

	public void updateContact(Contact contact) {
		
	}
	
	public void deleteContact(int id) {
		
	}
}
