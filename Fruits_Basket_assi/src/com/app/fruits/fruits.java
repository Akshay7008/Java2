package com.app.fruits;

public class fruits {
	private String name,color;
	private double weight;
	private boolean fresh;
	
	public fruits() 
	{
		this.name="no fruits";
		this.color="none";
		this.weight=00;
	}
	
	public fruits(String name, String color, double weight, boolean fresh) {
		
		this.name = name;
		this.color = color;
		this.weight = weight;
		this.fresh = fresh;
	}
	
	public String taste()
	{
		return "no specific taste";
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public double getWeight() {
		return weight;
	}

	public void setWeight(double weight) {
		this.weight = weight;
	}

	public boolean isFresh() {
		return fresh;
	}

	public void setFresh(boolean fresh) {
		this.fresh = fresh;
	}

	@Override
	public String toString() {
		return "fruits [name=" + name + ", color=" + color + ", weight=" + weight + "]";
	}
	
	
	
	

	
	
}
