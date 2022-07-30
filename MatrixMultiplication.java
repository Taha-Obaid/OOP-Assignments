public class MatrixMultiplication
{
	public static void main(String args[])
	{
		int a[][] = {{1,2,3},{4,5,6},{7,8,9}};
		int b[][] = {{10,20,30},{40,50,60},{70,80,90}};
		int c[][] = new int[3][3];
		System.out.println("Matrix a: "+"\n");
		for(int i =0; i<a.length; i++)
		{
			for(int j=0; j<b.length; j++)
			{
				System.out.print(a[i][j] + " ");
			}
			System.out.println();
		}
		System.out.println("-----------------------");
		System.out.println("Matrix b: "+"\n");
		for(int i =0; i<a.length; i++)
		{
			for(int j=0; j<b.length; j++)
			{
				System.out.print(b[i][j] + " ");
			}
			System.out.println();
		}
		System.out.println("-----------------------------");
		System.out.println("Matrix c: "+"\n");
		for(int i=0; i<a.length; i++)
		{
			for(int j=0; j<b.length; j++)
			{
				c[i][j] = a[i][j] * b[i][j];
				System.out.print(c[i][j] + " ");
			}
			System.out.println();
		}
	}
}