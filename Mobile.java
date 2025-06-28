//Has-a-Realtionship using mobile and battery 
package hasarelationship_early_instantiation;

public class Battery 
{
	String brand;
	double price;
	int mah;
	String type;

	public Battery() {
		// TODO Auto-generated constructor stub
	}
	Battery(String brand,double price,int mah,String type)
	{
		this.brand=brand;
		this.price=price;
		this.mah=mah;
		this.type=type;
		System.out.println("Battery Created");
	}
	
	public void displayBattery()
	{
		System.out.println("Brand : "+brand);
		System.out.println("Price : "+price);
		System.out.println("MAH : "+mah);
		System.out.println("Type : "+type);
		System.out.println("---------------------------");
	}
}
//-------------------------------------------------------------------
//Class Car
package hasarelationship_early_instantiation;

public class Mobile 
{
	String brand;
	String name;
	double price;
	int ram;
	int rom;
	String processor;
	Battery b1;
	
	Mobile()
	{
		
	}
	Mobile(String brand,String name,double price,int ram,int rom,String processor,String batBrand,double batPrice,int mah,String type)
	{
		this.brand= brand;
		this.name=name;
		this.price=price;
		this.ram=ram;
		this.rom=rom;
		this.processor=processor;
		System.out.println("Mobile Created ");
		
		b1=new Battery(batBrand,batPrice,mah,type);
	}

	public void displayMobile()
	{
		System.out.println("Brand : "+brand);
		System.out.println("Name : "+name);
		System.out.println("Price : "+price);
		System.out.println("RAM : "+ram);
		System.out.println("ROM : "+rom);
		System.out.println("Processor : "+processor);
		System.out.println("-----------------------------");
	}
}
//---------------------------------------------------------------------
package hasarelationship_early_instantiation;

public class MobileDriver 
{
	public static void main(String[] args) 
	{
		Mobile m1=new Mobile("Samsung","Galaxy A56",30000.0,4,64,"SnapDragon","Fast-Charge",3000.0,2500,"Li-ion");
		m1.displayMobile();
		m1.b1.displayBattery();
		
	}

}

