import java.util.Scanner;
class Addition
{
  void add(int a , int b)
   {
    int x = a;
    int y = b;
    System.out.println("x + y =  " + (x+y));
   }
  void add(int a , int b , int c)
   {
    int x = a;
    int y = b;
    int z = c;
    System.out.println("x + y + z =  " + (x + y + z));
   }
}

public class MethodOverloading
{
  public static void main(String args[])
   {
      Scanner S = new Scanner(System.in);
     Addition P = new Addition();
    System.out.println("\nEnter values of x , y & z");
     int a = S.nextInt();
     int b = S.nextInt();
     int c = S.nextInt();
      P.add( a , b );
      P.add( a , b , c );
   }
}
