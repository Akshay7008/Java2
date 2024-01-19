package test;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;


import static test.emptype.*;

public class utils {

		public static List<employee> custlist()
		{
			List<employee> emp =new ArrayList<employee>();
			//tring name, String email, emptype type, LocalDate jddate
			emp.add(new employee(122,"AKshay", "akshay@gmail.com", HR, LocalDate.parse("2002-02-12")));
			emp.add(new employee(123,"rajanwa", "rajanwa@gmail.com",DEVELOPER, LocalDate.parse("2023-02-12")));
			emp.add(new employee(121,"lali", "lali@gmail.com", DEVOPS, LocalDate.parse("2020-02-12")));
			return emp;
		}
}
