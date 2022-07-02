import java.util.Scanner;
class math
{
	int x, y, z;
	void add(int a, int b)
	{
		x = a;
		y = b;
		System.out.println("\na + b = "+(x+y));
	}
	void multiply(int a, int b, int c)
	{
		x = a;
		y = b;
		z = c;
		System.out.println("\na*b*c ="+(x*y*z));
	}
}
public class ParameterizedMethod
{
	public static void main(String args[])
	{
		Scanner S = new Scanner(System.in);
		System.out.println("\nEnter a & b");
		int A1 = S.nextInt();
		int B1 = S.nextInt();
		math m = new math();
		m.add(A1, B1);
		System.out.println("\n-----------------------------------------");
		System.out.println("\nEnter a, b, c");
		int A2 = S.nextInt();
		int B2 = S.nextInt();
		int C = S.nextInt();
		m.multiply(A2, B2, C);
	}
}