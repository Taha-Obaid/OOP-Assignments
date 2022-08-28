public class Exception
{
	public static void main(String args[])
	{
		int x = 10;
		int y = 20;
		System.out.println("x+y= "+(x+y));
		int Sum = x+y;
		try{
			int z = Sum/0;
			System.out.println("z= "+z);
		}
		catch(Exception e){
			System.out.println("zamnn..");
		}
		int Subtract = y-x;
		System.out.println("Subtract= "+Subtract);
	}
}