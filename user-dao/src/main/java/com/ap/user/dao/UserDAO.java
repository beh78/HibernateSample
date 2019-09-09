package com.ap.user.dao;


import org.hibernate.Session;
import org.hibernate.Transaction;

import com.ap.user.entity.User;
import com.ap.user.util.HibernateUtil;

public class UserDAO {
	
	public User getUser(int id) {
		return null;
	}

	public void addUser(User user) {
		
		Session session  = HibernateUtil.getSessionFactory().openSession();
		Transaction trx  = session.beginTransaction();
		session.save(user);
		trx.commit();
		session.close();
	}

	public void updateUser(User user) {
		
	}

	public void deleteUser(int id) {
		
	}

}
