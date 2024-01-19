package com.app.fruits;

public class mango extends fruits {
	
	private static String name="Mango";
		
	public mango()
	{
		super();
	}
	
	
	
	
	public mango(String color,double weight,boolean fresh)
	{
		super(name, color, weight, fresh);
	}
	
	public void pulp()
	{
	System.out.println(super.getName()+super.getColor()+"Creating pulp");
	
	}
	
	public String taste()
	{
		return "Sweet";
	}
	
	
	
	
	
	
	
	


}
