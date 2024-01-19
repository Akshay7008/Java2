package Client;

import java.util.Scanner;

import BL.Car;
import BL.color;

public class tester_car {

	public static void main(String[] args) {
			
//		Car c1=new Car("DODGE", color.red , 7500000);
//		System.out.println(c1);
		
		Car [] showroom=new Car[5];
		int index=0,choice;
		
		do 
		{
			System.out.println("Menu 1:Show all cars");
			System.out.println("Menu 2:Add cars");
			System.out.println("Menu 3:change color");
			System.out.println("Menu 4:edit price");
			System.out.println("Menu 5:remove car ");
			System.out.println("Menu 6: yo exit");
			
			Scanner s=new Scanner(System.in);
			choice=s.nextInt();
			switch(choice)
			{
			case 1:
				for (int i=0;i<showroom.length;i++)
				{
					if (showroom[i]!=null)
					System.out.println(showroom[i]);
					System.out.println();
				}
				
				break;
			case 2:
				System.out.println("Enter the car name,car color:white,red,blue,black,grey and price pf car");
				if (index<=showroom.length)
				{
					Car c1=new Car(s.next(), color.valueOf(s.next().toLowerCase()), s.nextDouble());
					showroom[index]=c1;
					index++;
				}
				else
					System.out.println("array is full");
				break;
			case 3:
				System.out.println("enter the car no to change the color");
				int id_c=s.nextInt();
				
				for (int i=0;i<showroom.length;i++)
				{
					if (showroom[i].getid()==id_c)
					{
						System.out.println("Enter the color red,blue,white black,gery");
						showroom[i].setColor(color.valueOf(s.next().toLowerCase()));
						break;
					}
					
				}
				break;
			case 4:
				System.out.println("enter the car_no to chnage the price");
				int id_p=s.nextInt();
				
				for (int i=0;i<showroom.length;i++)
				{
					if (showroom[i].getid()==id_p)
					{
						System.out.println("Enter the price");
						showroom[i].setPrice(s.nextDouble());
						break;
					}
					
				}
				break;
			case 5:
				System.out.println("enter the car_no to remove car from showroom");
				int id_r=s.nextInt();
				
				for (int i=0;i<showroom.length;i++)
				{
					if (showroom[i].getid()==id_r)
					{
						System.out.println("Removing Car");
						showroom[i]=null;
						break;
					}
					
				}
				
				
				break;
				
				default: 
					System.out.println("exit");
			}
			
			
		}while(choice<=5);
		
		

	}

}
