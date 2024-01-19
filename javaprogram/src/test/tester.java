package test;

import java.util.Comparator;
import java.util.List;
import java.util.Scanner;
import static test.utils.custlist;

public class tester {

	public static void main(String[] args) {
		try (Scanner sc =new Scanner(System.in)){
			List<employee> l1 = custlist();
			boolean exit=false;
			System.out.println("1.display \n2.add the employee\n3.find the empolyee by name \n4.sort by email\n6.sory by name1 \n5.Exit");
			while(!exit)
				try
				{
					switch (sc.nextInt()) {
					case 1:
						for(employee e : l1)
						{
							System.out.println(e);
						}
						break;
					case 2:
						System.out.println("enter name, email, type,date");
						 employee emp1 = validation.add_emp(sc.nextInt(),sc.next(), sc.next(), sc.next(), sc.next(), l1);
						 l1.add(emp1);
						 break;
						 
					case 3:
						System.out.println("Enter the employee name");
						String c1 = sc.next();
						l1.stream().filter(p -> p.getName().equals(c1)).forEach(a -> System.out.println(a));
						break;
					case 4:
//						l1.stream().sorted((p1,p2)->p2.getEmail().compareTo(p1.getEmail())).forEach(p->System.out.println(p));
						l1.sort(Comparator.comparing(employee ::getEmpid));
						break;
					case 6:
						l1.stream().sorted((p1,p2)->p1.getName().compareTo(p2.getName())).forEach(p->System.out.println(p));
						 break;
					case 5:
						
						exit =true;

					default:
						break;
					}
				{
					
				}
		}
		catch (Exception e) {
			System.out.println(e);
		}

		} 
	}

}
