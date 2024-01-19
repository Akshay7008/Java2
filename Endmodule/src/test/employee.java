package test;

import java.time.LocalDate;

public class employee {
	private int empid;
	private String name;
	private String email;
	private emptype type;
	private LocalDate jddate;
//	private static int id;
	
// static
//	{
//		id=10;
//	}
 

public employee() {
	super();
}

public employee( int id,String name, String email, emptype type, LocalDate jddate) {
	super();
	this.empid = id;
	this.name = name;
	this.email = email;
	this.type = type;
	this.jddate = jddate;
}

public String getName() {
	return name;
}

public void setName(String name) {
	this.name = name;
}

public String getEmail() {
	return email;
}


public int getEmpid() {
	return empid;
}

public void setEmpid(int empid) {
	this.empid = empid;
}

public void setEmail(String email) {
	this.email = email;
}

public emptype getType() {
	return type;
}

public void setType(emptype type) {
	this.type = type;
}

public LocalDate getJddate() {
	return jddate;
}

public void setJddate(LocalDate jddate) {
	this.jddate = jddate;
}

@Override
public String toString() {
	return "employee [empid=" + empid + ", name=" + name + ", email=" + email + ", type=" + type + ", jddate=" + jddate
			+ "]";
}

public boolean equals (Object obj)
{
	if (obj instanceof employee)
	{
		this.email.equals(((employee)obj).email);
	}
	return false;
}



 
 	
	

}
