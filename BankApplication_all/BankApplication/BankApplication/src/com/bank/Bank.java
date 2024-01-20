package com.bank;
	
import java.time.LocalDate;
	
public class Bank 
{
	private int acno;
	private String name;
	private double bal;
	private LocalDate date;
	private AccountType type;
	public static int idcnt;
	public Bank(String name, double bal, LocalDate date, AccountType type) {
		super();
		this.acno = idcnt;
		this.name = name;
		this.bal = bal;
		this.date = date;
		this.type = type;
		idcnt++;
	}
		public Bank (String name)
		{
			this.name=name;
		}
	
	static
	{
		idcnt=1;
	}
	
	public int getAcno() {
		return acno;
	}
	public void setAcno(int acno) {
		this.acno = acno;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public double getBal() {
		return bal;
	}
	public void setBal(double bal) {
		this.bal = bal;
	}
	public LocalDate getDate() {
		return date;
	}
	public void setDate(LocalDate date) {
		this.date = date;
	}
	public AccountType getType() {
		return type;
	}
	public void setType(AccountType type) {
		this.type = type;
	}
	public static int getIdcnt() {
		return idcnt;
	}
	public static void setIdcnt(int idcnt) {
		Bank.idcnt = idcnt;
	}
	
	public void withdraw(double amt)throws Exception
	{
		if(this.bal<5000)
			throw new Exception("Insufficient Balanace");
		this.bal=bal-amt;
	}
	
	public void deposite(double amt)
	{
		this.bal=bal+amt;
	}
	
	public void transferMoeny(double amt,Bank b1)
	{
		this.bal=this.bal-amt;
		b1.setBal(b1.getBal()+amt);
	}
	
	@Override
	public String toString() {
		return "Bank [acno=" + acno + ", name=" + name + ", bal=" + bal + ", date=" + date + ", type=" + type + "]";
	}
	
	public boolean equals(Object obj)
	{
		if(obj instanceof Bank)
		{
			Bank b1=(Bank)obj;
			return this.name.equals(b1.name);
			//return this.name.equals(((Bank)obj).name);
		}
		return false;
	}
	
	
		
	
	
}
