import java.util.*;
class BarGraphs_FreqOfDigits_
{
    public static void main()
    {
         Scanner sc=new Scanner(System.in);
         long n=0,b=0,c=0,y=0,j=0,i=0;
         System.out.println("Enter a number");
         n=sc.nextLong();
         System.out.println();
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
             System.out.print(i+" ");
             for (j=1;j<=c;j++)
             {
               System.out.print("*");
             }
             System.out.println();
         }
    }
} 