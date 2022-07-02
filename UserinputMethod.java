import java.util.Scanner;
class methods
{
	int a;
	double b;
	char d;
	String e;
	int f;
	methods(int x, double y)
	{
		a = x;
		b = y;
	}
	methods(String name, char section, int age)
	{
		e = name;
		f = age;
		d = section;
	}
}
public class UserinputMethod
{
	public static void main(String args[])
	{
		Scanner S = new Scanner(System.in);
		System.out.println("\nEnter an int & a float value:");
		int l = S.nextInt();
		double m = S.nextDouble();
		methods j = new methods(l, m);
		System.out.println("\na+b= "+ (j.a+j.b));
		System.out.println("\n----------------------------------------");
		System.out.println("\nEnter ur Name, Section & Age:");
		String nam = S.nextLine();
		String se = S.nextLine();
		char sec = S.next().charAt(0);
		int ag = S.nextInt();
	    methods k = new methods(nam, sec, ag);
		System.out.println("\nName: "+k.e+"\nSection: "+k.d+"\nAge: "+k.f);
	}
}