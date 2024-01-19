package com.app.fruits;

import java.util.Scanner;

public class tester_basket {

	public static void main(String[] args) {
		System.out.println("Enter the size of basket");
		Scanner s=new Scanner(System.in);
		int size=s.nextInt();
		
		fruits [] basket=new fruits [size];
		
		 int index=0,choice;
		 
		 do
		 {

				
				System.out.println("Menu 1:Show fruits");
				System.out.println("Menu 2:Add Mango");
				System.out.println("Menu 3:Add Apple");
				System.out.println("Menu 4:Add Orange");
				System.out.println("Menu 5:Display Name of friuts");
				System.out.println("Menu 6: display taste of friuts");
				
				System.out.println("Enter the choice");
				choice=s.nextInt();
				switch (choice) 
				{
				case 1:
					for (int i=0;i<basket.length;i++)
					{
						if(basket[i]!=null)
						{
							System.out.println(basket[i]);
							System.out.println();
						}
					}
					
					
					break;
					
				case 2://Adding Mango
					if (index<=basket.length)
					{
						System.out.println("Tell the fruit is fresh or not (true/false)");
						boolean fresh_fruits=s.nextBoolean();
						if (fresh_fruits)
						{
							System.out.println("Enter the color,weight of fruit");
							mango m1=new mango(s.next(),s.nextDouble(), fresh_fruits);
							basket[index]=m1;
							index++;
					
							System.out.println("Fruit added in basket");
						}
						else
							System.out.println("Fruit is not fresh");
					}
					break;
				case 3:
					if (index<=basket.length)
					{
						System.out.println("Tell the fruit is fresh or not (true/false)");
						boolean fresh_fruit2=s.nextBoolean();
						if (fresh_fruit2)
						{
							System.out.println("Enter the color,weight of fruit");
							apple a1=new apple(s.next(),s.nextDouble(), fresh_fruit2);
							basket[index]=a1;
							index++;
							
							System.out.println("Fruit added in basket");
						}
						else
							System.out.println("Fruit is not fresh");
					}
					break;
				case 4:
					if (index<=basket.length)
					{
						System.out.println("Tell the fruit is fresh or not (true/false)");
						boolean fresh_fruit3=s.nextBoolean();
						if (fresh_fruit3)
						{
							System.out.println("Enter the color,weight of fruit");
							orange o1=new orange(s.next(),s.nextDouble(), fresh_fruit3);
							basket[index]=o1;
							index++;
							
							System.out.println("Fruit added in basket");
						}
						else
							System.out.println("Fruit is not fresh");
					}
					break;
				
				case 5:
					System.out.println("Name of all fruits");
					for (int i=0;i<basket.length;i++)
					{
						if(basket[i]!=null)
						System.out.println(basket[i].getName());
//						System.out.println();
					}
					break;
					
				case 6:
					for (int i=0;i<basket.length;i++)
					{
//						System.out.println("enter the name of furit who taste want to know");
						if(basket[i]!=null)	
						System.out.println(basket[i].getName()+" , "+basket[i].getColor()+" , "+basket[i].getWeight()+" , "+" "+basket[i].taste());
						System.out.println();
					}
					break;
					
					
					
				default:
					
				}
				
				
					
			 
		 }while(choice<=6);
		
		
		

	}

}
