class math
{
	int x,y;
	void add()
	{
		System.out.println("\nx+y = "+(x+y));
	}
	int subtract(int a, int b)
	{
		x = a;
		y = b;
		return x-y;
	}
}
public class Methods
{
	public static void main(String args[])
	{
		math m = new math();
		m.x = 2;
		m.y = 3;
		m.add();
		System.out.println("\nx-y = "+m.subtract(14, 7));
	}
}