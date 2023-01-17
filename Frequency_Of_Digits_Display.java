//Enter any number and find the frequency of each digits.
import java.util.*;
class Frequency_Of_Digits_Display
{
    public static void main()
    {
         Scanner sc=new Scanner(System.in);
         long n=0,b=0,c=0,y=0,j=0,i=0;
         System.out.println("Enter a number");
         n=sc.nextLong();
         System.out.println();
         System.out.println("Digit: Frequency:");
         for(i=0;i<=9;i++)
         {
             b=n;
             c=0;
             y=0;
             j=1;
             while(b>0)
             {
                y=b%10;
                if(y==i)
                {
                    c++;
                }
                b=b/10;
             }
             if(c>0)
             {
             System.out.print(i+"\t");
             System.out.print(c);
             System.out.println();
             }
         }
    }
} 