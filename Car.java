//Has-a-Relationship early instanciation.
//Class Engine
package hasarelationship_early_instantiation;

public class Engine 
{
	String type;
	int displacement;
	int cylinder;
	int speed;
	double price;
	
	public Engine() {
		// TODO Auto-generated constructor stub
	}
	Engine(String type,int displacement,int cylinder,int speed,double price)
	{
		this.type=type;
		this.displacement=displacement;
		this.cylinder=cylinder;
		this.speed=speed;
		this.price=price;
		System.out.println("Engine Created ");
	}
	
	public void displayEngine()
	{
		System.out.println("Type : "+type);
		System.out.println("Displacement : "+displacement);
		System.out.println("Cylinder : "+cylinder);
		System.out.println("Speed : "+speed);
		System.out.println("Price : "+price);
		System.out.println("--------------------------------");
	}

}
//--------------------------------------------------------------------------------
//Class Car
package hasarelationship_early_instantiation;

public class Car 
{
	String brand;
	String name;
	int topSpeed;
	double price;
	String color;
	
	Engine e1;
	
	public Car() {
		// TODO Auto-generated constructor stub
	}
	Car(String brand,String name,int topSpeed,double price,String color,String type,int displacement,int cylinder,int speed,double enginePrice)
	{
		this.brand=brand;
		this.name=name;
		this.topSpeed=topSpeed;
		this.price=price;
		this.color=color;
		
		System.out.println("Car Created");
		
		e1=new Engine(type,displacement,cylinder,speed,enginePrice);
	}
	
	public void displayCar()
	{
		System.out.println("Brand: "+brand);
		System.out.println("Name: "+name);
		System.out.println("TopSpeed: "+topSpeed);
		System.out.println("Price: "+price);
		System.out.println("Color: "+color);
		System.out.println("--------------------------");
	}

}
//-----------------------------------------------------------------------------------
package hasarelationship_early_instantiation;

public class CarDriver 
{
	public static void main(String[] args) 
	{
		Car c1 = new Car("Maruti","Vitara",120,450000.0,"Red","haxzard",3,4,120,30000.0);
		
		c1.displayCar();
		c1.e1.displayEngine();	
	}
}
//-----------------------------------------------------------------------------
