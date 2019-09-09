package com.ap.user.client;

import com.ap.user.dao.BankDAO;
import com.ap.user.entity.Bank;

public class BankClient {

	public static void main(String[] args) {

		Bank bank =  new Bank();
		bank.setBankname("bankTEST1");
		bank.setAccountno("55545454");
		bank.setSsn("2254782");
		
		BankDAO bankDAO = new BankDAO();
		bankDAO.addBank(bank);
		System.out.println("the new Bank info added : " + bank.getBankname() + "\n "
														+ bank.getAccountno() + "\n "
														+ bank.getSsn() );
	}

}
