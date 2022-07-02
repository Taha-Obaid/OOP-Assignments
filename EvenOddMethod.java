class EvenOdd
{
	void evenodd()
	{
		for(int i=1; i<=20; i++)
		{
			if(i%2==0)
			{ System.out.println(i + " is even"); }
		   else { System.out.println(i + " is odd"); }
		}
	}
}
public class EvenOddMethod
{
	public static void main(String args[])
	{
		EvenOdd eo = new EvenOdd();
		eo.evenodd();
	}
}