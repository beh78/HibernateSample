package com.ap.user.client;

import com.ap.user.dao.ContactDAO;
import com.ap.user.entity.Contact;

public class ContactClient {

	public static void main(String[] args) {

		Contact contact = new Contact();
		
		contact.setAddress("addressTEST1");
		contact.setCity("cityTEST1");
		contact.setCountry("countryTEST1");
		contact.setPhone("phoneTEST1");
		contact.setState("stateTEST1");
		
		ContactDAO contactDAO = new ContactDAO();
		contactDAO.addContact(contact);
		System.out.println("adding new contact :::  " + contact.getAddress() +"\n "
													  + contact.getCity() + "\n "
													  + contact.getCountry() + "\n "
													  + contact.getPhone() + "\n "
													  + contact.getState() );
	}

}
