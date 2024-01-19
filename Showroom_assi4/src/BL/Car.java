package BL;

public class Car {

	// id,name,color,price
	private String name;
	private color color_car;
	private double price;
	private static int id;
	public int id_1;
	private static double discount;

	static {
		id = 10;
		discount = 20;

	}

	public Car()
	{
		super();
		this.name="NANO";
		this.color_car=color.white;
		this.price=150000;
		
		id_1=id++;
	}

	public Car(String name, color color_car, double price) 
	{
		super();
		this.name = name;
		this.color_car = color_car;
		this.price = price;
		id_1=id++;
		
		
	}
	
	private double disprice()
	{
		price=(price*discount)/100;
		return price;
	}

	public String getName() {
		return name;
	}
	
	public int getid() {
		return id_1;
	}

	public void setName(String name) {
		this.name = name;
	}
	
	public void setColor(color color_car) 
	{
		this.color_car = color_car;
	}
	
	public color getcolor() {
		return color_car;
	}
	
	

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}
	
	
	
	
	
	

	@Override
	public String toString() 
	{
		disprice();
		return "Car [name=" + name + ", color_car=" + color_car + ", price=" + price + ", id_1=" + id_1 +", discount="+discount +"]";
	}

	
	
	
	
	
	
	
	





	
	
	
	

}
