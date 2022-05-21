import java.util.Scanner;
public class Loop
{
  public static void main(String [] args)
    {
       System.out.println("\n\t\t\tLoop");

       Scanner S = new Scanner(System.in);

       System.out.println("\nEnter Initial Value:");
        long ini = S.nextLong();

       long i= ini;

       System.out.println("\nEnter Final Value:");
        long fin = S.nextLong();

       System.out.println("\nEnter interval:");
         long interv= S.nextLong();

         System.out.println("----------------------");

         if(ini<fin)
             { do
                 {System.out.println(i);
                   i+=interv;
                 }
                   while(i<=fin);
              }

         if(ini>fin)
             { do
                 {System.out.println(i);
                    i-=interv;
                 }
                  while(i>=fin);
              }
     }
}
