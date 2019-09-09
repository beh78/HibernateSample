package com.ap.user.client;

import com.ap.user.dao.UserDAO;
import com.ap.user.entity.User;

public class UserClient {

	public static void main(String args[]) {
		User user =  new User();
		user.setFirstName("userTEST1");
		user.setLastName("lastTEST1");
		user.setMiddleName("");
		user.setGendar("female");
		UserDAO userDAO =  new UserDAO();
		userDAO.addUser(user);
		System.out.println("User new data inserted : " + user.getFirstName() + "\n  "
				+ user.getLastName() + "\n  "
				+ user.getMiddleName() + "\n " 
				+ user.getGendar() + "\n " 
				+ user.getUserId() );
		
		
	}
}
