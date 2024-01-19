package test;

import java.time.LocalDate;
import java.util.List;




public class validation {
	
	//emum ko ko user ne enum to lwercase me dala to uppercase mai convert kar dega
	public static emptype validation_emptype(String plan)
	{
		return emptype.valueOf(plan.toUpperCase());
	}
	
	public static void validation_email(String email,List<employee> list1) throws custexp
	{
		employee e1=new employee();
		if (list1.contains(email))
		{
			throw new custexp("email Already Exists");
		}
		
	}
	
	public static employee add_emp(int id,String name, String email, String type, String jddate,List<employee> list2) throws custexp
	{
		emptype enum1 = validation_emptype(type);
		validation_email(email, list2);
		return new employee(id,name, email, enum1, LocalDate.parse(jddate));
	}

}
