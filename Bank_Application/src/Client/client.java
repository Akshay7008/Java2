package Client;

import java.util.Scanner;

import BL.Bank_Locker;

public class client {

	public static void main(String[] args) {
	
//		Bank_Locker b1=new Bank_Locker("Smith", 50000);
////		System.out.println(b1);
//		b1.deposite(10000);
//		b1.applylocker(100, 6);
//		System.out.println(b1);
		int index=0,choice;
		Bank_Locker [] bank=new Bank_Locker[5];
		
		do 
		{
			System.out.println("Menu 1:display the accont details");
			System.out.println("Menu 2:Add account");
			System.out.println("Menu 3:deposite money");
			System.out.println("Menu 4:withdraw money");
			System.out.println("Menu 5:Apply for locker");
			
			Scanner s=new Scanner(System.in);
			System.out.println("Enter the choice");
			choice=s.nextInt();
			
			switch (choice)
			{
			case 1:
				for (int i=0;i<bank.length;i++)
				{
					if(bank[i]!=null) 
					{
						System.out.println(bank[i]);
						System.out.println();
					}
					
				}
				
				break;
			case 2: //Adding Account
				if(index<bank.length)
				{
					System.out.println("Enter the name and balance");
					Bank_Locker b1=new Bank_Locker(s.next(), s.nextDouble());
					bank[index]=b1;
					index++;
					System.out.println("created account Sussefully");
				}
				break;
			case 3://deposite Money
				System.out.println("Enter the account no");
				int n_ano=s.nextInt();
				for (int i=0;i<bank.length;i++)
				{
					if (bank[i].getActno()==n_ano)
					{
						System.out.println("Enter the amount");
						bank[i].deposite(s.nextDouble());
						break;
					}
				}
				
				break;
			case 4:
				System.out.println("Enter the account no");
				int n1_ano=s.nextInt();
				for (int i=0;i<bank.length;i++)
				{
					if (bank[i].getActno()==n1_ano)
					{
						System.out.println("Enter the amount");
						bank[i].withdraw(s.nextDouble());
						break;
					}
				}
				break;
			case 5:
				System.out.println("Enter the account no for  which where we want locker");
				int n2_ano=s.nextInt();
				for (int i=0;i<bank.length;i++)
				{
					if (bank[i].getActno()==n2_ano)
					{
						System.out.println("Enter the hr.ly rate and for how many month u want a locker");
						bank[i].applylocker(s.nextDouble(), s.nextInt());
						break;
					}
					
				}
				break;
			}
			
		}while(choice<=5);
		
//		
		

	}

}
