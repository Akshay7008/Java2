package com.app.fruits;

public class orange extends fruits{
	
	private static String name="Orange";
	
	public orange()
	{
		super();
	}
	
	public orange(String color,double weight,boolean fresh)
	{
		super(name, color, weight, fresh);
	}
	
	public void pulp()
	{
	System.out.println(super.getName()+super.getColor()+"Extracting Juice!");
	
	}
	
	public String taste()
	{
		return "Sour";
	}

}
