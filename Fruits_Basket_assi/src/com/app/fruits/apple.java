package com.app.fruits;

public class apple extends fruits{
	
	private static String name="Apple";
	
	public apple()
	{
		super();
	}
	
	public apple(String color,double weight,boolean fresh)
	{
		super(name, color, weight, fresh);
	}
	
	public void jam()
	{
	System.out.println(super.getName()+super.getColor()+"Making Jam!");
	
	}
	@Override
	public String taste()
	{
		return "Sweet and Sour";
	}

}
