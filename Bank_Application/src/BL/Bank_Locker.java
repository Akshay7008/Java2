package BL;

public class Bank_Locker {
	
	private int actno;
	private String name;
	private double balance;
	private double amount;
	private  static int id=1001,id_1=10;
	private Locker obj;
	
	public Bank_Locker(String name, double balance) 
	{
		super();
		this.name = name;
		this.balance = balance;
		actno=id++;
	}
	
	public void withdraw(double amount)
	{
		balance-=amount;
		System.out.println("amount:" +balance);
	}
	
	public void deposite(double amount)
	{
		balance+=amount;
		System.out.println("amount:" +balance);
	}
	
	public void applylocker(double hrlyrate,int months )
	{
		this.obj = new Locker(hrlyrate, months);
		System.out.println("---done-----");
	}
	
	
	public int getActno() {
		return actno;
	}

	public void setActno(int actno) {
		this.actno = actno;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public double getBalance() {
		return balance;
	}

	public void setBalance(double balance) {
		this.balance = balance;
	}
	
	
	
	@Override
	public String toString() {
		
		if (obj!=null)
		{
			System.out.println("Locker Assigned");
			 return "BankAccount [actid=" + actno + ", name=" + name + ", balance=" + balance + "  "+obj+"]";
			 
		}
		else
		{
			System.out.println("Locker not Assigned");
		return "BankAccount [actid=" + actno + ", name=" + name + ", balance=" + balance +"]";
	}
	}


	
	private class Locker
	{
		private  int lockerid;
		private double hrlyrate;
		private double month;
		
		public Locker( double hrlyrate, double month) 
		{
			super();
			this.hrlyrate = hrlyrate;
			this.month = month;
			lockerid=id_1++;
			System.out.println("Locker is assigned for the accid: "+ actno);
		}
		
		private double l_rate;
		
		public double lockerrate()
		{
			l_rate=hrlyrate*month;
			return l_rate;
		}
		@Override
		public String toString() {
			return "Locker [lockerid=" + lockerid + ", hrlyrate=" + hrlyrate + ", month=" + month + ", locker_rate=" + l_rate
					+ "]";
		}
		
		
		
	}
	
	
	

}
