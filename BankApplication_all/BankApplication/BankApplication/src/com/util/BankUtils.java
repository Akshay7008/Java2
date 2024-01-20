package com.util;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

import com.bank.AccountType;
import com.bank.Bank;

public class BankUtils 
{//String name, double bal, LocalDate date, AccountType type) {
	
	public static List<Bank> populateBank()
	{
		List<Bank> lst=new ArrayList<>();
		
		lst.add(new Bank("AAA",500,LocalDate.parse("2023-01-23"),AccountType.SAVING));
		lst.add(new Bank("BBB",50000,LocalDate.parse("2023-01-23"),AccountType.CURRENT));
		lst.add(new Bank("CCC",50000,LocalDate.parse("2023-01-23"),AccountType.LOAN));
		
		return lst;
	}
}
