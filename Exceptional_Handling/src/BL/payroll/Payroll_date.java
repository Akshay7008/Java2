package BL.payroll;

import java.text.SimpleDateFormat;
import java.text.ParseException;
import java.util.Date;

public class Payroll_date {
	private int actid;
	private static int id;
	private String name;
	private accounttype typeact;
	private double balance;
	private Date dob;
	private static SimpleDateFormat sdf;

	static {
		id = 1001;
	    sdf = new SimpleDateFormat("dd-mm-yyyy");
	}

	public Payroll_date(String name, String typeact, double balance, String dob) throws ParseException  
	{
		this.actid = id;
		id++;
		this.name = name;
		this.typeact = accounttype.valueOf(typeact);
		this.balance = balance;
		this.dob = sdf.parse(dob);
	}

	public void withdraw(double amount) throws Payroll_exception {
		if (amount > balance) 
		{
			System.out.println("------less balance----");
			throw new Payroll_exception("------Low Balance: unable to withdraw amount-------");
		} 
		else 
		{
			this.balance -= amount;
			System.out.println("remaining balance: " + this.balance);
		}
	}

	public void deposit(double amount) 
	{
		this.balance += amount;
		System.out.println("New  balance: " + balance);

	}
	
	public void trnsferfund(double amount,Payroll_date obj)
	{
		this.balance-=amount;
		obj.balance+=amount;
		System.out.println("this.name transfer fund to obj.name balance of obj.name: "+ obj.balance);
	}

	@Override
	public String toString() {
		return "Payroll_date [actid=" + actid + ", name=" + name + ", typeact=" + typeact + ", balance=" + balance
				+ ", dob=" + dob + "]";
	}
	
	

}
