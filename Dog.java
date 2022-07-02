class Dog
{
	String col;
	String nam;
	void barking1()
	{
		System.out.println("the dawg is barking");
	}
	void barking2()
	{
		System.out.println("the dog is barking");
	}
}
public class Dog
{
	public static void main(String args [])
	{
		Dog d1 = new Dog();
		Dog d2 = new Dog();
		d1.col = "Black";
		d1.nam = "Dawg";
		d2.nam = "Dog";
		d2.col = "Red";
		System.out.println(d1.nam);
		System.out.println(d1.col);
		d1.barking1();
		System.out.println(d2.nam);
		System.out.println(d2.col);
		d2.barking2();
	}
}