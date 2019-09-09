package com.apex.user.client;

import com.apex.user.dao.UserDAO;
import com.apex.user.entity.User;

public class UserClient {

	public static void main(String args[]) {
		User user =  new User();
		user.setFirstName("ALIREZA");
		user.setLastName("Abedin");
		user.setMiddleName("");
		user.setGendar("male");
		UserDAO userDAO =  new UserDAO();
		userDAO.addUser(user);
		System.out.println("User new data inserted : " + user.getFirstName() + "\n  "
				+ user.getLastName() + "\n  "
				+ user.getMiddleName() + "\n " 
				+ user.getGendar() + "\n " 
				+ user.getUserId() );
		
		
	}
}
