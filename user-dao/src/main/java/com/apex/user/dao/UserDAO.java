package com.apex.user.dao;


import org.hibernate.Session;
import org.hibernate.Transaction;

import com.apex.user.entity.User;
import com.apex.user.util.HibernateUtil;

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

	public void deleteUser(int i) {
		
	}

}
