package com.tester;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import static  com.util.BankUtils.populateBank;

import com.bank.*;

public class TestBank {
	
	

	public static void main(String[] args) 
	{
		
		
		List<Bank> lst=populateBank();
		boolean exit=false;
		Scanner sc =new Scanner(System.in);
		while(!exit)
		{
			
			System.out.println("1.Display Bank Account \n2.Add Account \n3.Show ac under 4000 \n4.Deposite moneny \n5.Withdraw moeny \n6.Remove Ac ");
			
			try 
			{
			switch(sc.nextInt())
			{
				case 1:
					{
						//lst.forEach(System.out::println);
						lst.forEach(s->System.out.println(s));
						break;
					}
				case 2:
				{
					//String name, double bal, LocalDate date, AccountType type) {
					System.out.println("name,balanace,date,ac type,");
					lst.add(new Bank(sc.next(),sc.nextDouble(),LocalDate.parse(sc.next()),AccountType.valueOf(sc.next().toUpperCase())));
					break;
				}
				
				case 3:
				{
					//lst.stream().filter(b->b.getBal()>4000).forEach(System.out::println);
					
					for(Bank b : lst)
					{
						if(b.getBal()>4000)
						{
							System.out.println(b);
						}
					}
					break;
				}
				
				case 4:
				{
					System.out.println("Enter ac holder name and moeny to deposite");
					Bank b1=new Bank(sc.next());
					
						int index=lst.indexOf(b1);
						if(index !=-1)
						{
							b1=lst.get(index);
							b1.deposite(sc.nextDouble());
							System.out.println("Moeny added succesfully");
						}
						break;
				}
				
				case 5:
				{
					System.out.println("Enter ac holder name and moeny to withdraw");
					Bank b1=new Bank(sc.next());
					
						int index=lst.indexOf(b1);
						if(index !=-1)
						{
							b1=lst.get(index);
							b1.withdraw(sc.nextDouble());
							System.out.println("Moeny debited succesfully");
						}
						break;
				}
				
				case 6:
				{
					Bank b1=new Bank(sc.next());
					
					int index=lst.indexOf(b1);
					if(index !=-1)
					{
						b1=lst.get(index);
						
						lst.remove(b1);
					}
					break;
				}
			}
			}
			catch(Exception e)
			{
				System.out.println(e.getMessage());
			}
			
		}
		
	}

}
