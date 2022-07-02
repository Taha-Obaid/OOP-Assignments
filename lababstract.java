abstract class Vehicle
{
	int noofwheels;
	String colour;
	String fueltype;
	float speed;
 abstract void start();
 abstract void accelerate();
 abstract void brake();
}
class transportationvehicle extends Vehicle
{
	int noofdoors;
	float loadcapacity;
  void start()
  {
  }
  void accelerate()
  {
  }
  void brake()
  {
  }
}
class Van extends transportationvehicle
{
	int noofboxes;
    void start()
	{
		System.out.println("\nThe van is starting.");
	}
    void accelerate()
	{
		System.out.println("The van is accelerating");
	}
    void brake()
	{
		System.out.println("The van is stopping.");
	}
	void loadVan()
	{
		System.out.println("Van is loading.");
	}
}
class Truck extends transportationvehicle
{
	int noofboxes;
	float sizeofcontainer;
    void start()
	{
		System.out.println("\nThe Truck is starting.");
	}
    void accelerate()
	{
		System.out.println("The Truck is accelerating");
	}
    void brake()
	{
		System.out.println("The Truck is stopping.");
	}
	void loadTruck()
	{
		System.out.println("Truck loads containers.");
	}
}
public class lababstract
{
	public static void main(String args[])
	{
		System.out.println("\t\t\t--Van--");
		Van v = new Van();
	    v.noofwheels = 4;
		System.out.println("No. of wheels: "+v.noofwheels);
		v.colour = "Black";
		System.out.println("Colour: "+v.colour);
		v.fueltype = "Petrol";
		System.out.println("Fuel-type: "+v.fueltype);
	    v.speed = 90;
		System.out.println("Speed: "+v.speed);
		v.noofdoors = 4;
		System.out.println("No. of doors: "+v.noofdoors);
		v.loadcapacity = 2000;
		System.out.println("Load capacity: "+v.loadcapacity);
		v.noofboxes = 14;
		System.out.println("No. of boxes: "+v.noofboxes);
		v.start();
		v.accelerate();
		v.brake();
		v.loadVan();
System.out.println("-----------------------------------------------------------");
       System.out.println("\t\t\t--Truck--");
		Truck t = new Truck();
		t.noofwheels = 12;
		System.out.println("No. of wheels: "+t.noofwheels);
		t.colour = "Red";
		System.out.println("Colour: "+t.colour);
		t.fueltype = "Petrol";
		System.out.println("Fuel-type: "+t.fueltype);
	    t.speed = 76;
		System.out.println("Speed: "+t.speed);
		t.noofdoors = 2;
		System.out.println("No. of doors: "+t.noofdoors);
		t.loadcapacity = 17000;
		System.out.println("Load capacity: "+t.loadcapacity);
		t.noofboxes = 31;
		System.out.println("No. of boxes: "+t.noofboxes);
		t.start();
		t.accelerate();
		t.brake();
		t.loadTruck();
	}
}