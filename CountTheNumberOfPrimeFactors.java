import java.util.*;
public class CountTheNumberOfPrimeFactors
{
    public static void main (String args[])
    {
        Scanner sc= new Scanner (System.in);
        System.out.println("Enter a number");
        int n=sc.nextInt();
        int m=n;
        int f=2;
        int s=0;
        int c=0;
        while(m>1)
        {
            if(m%f==0)
            {
                s=s+f;
                m=m/f;
                c++;
            }
            else
            {
                f=f+1;
            }
        }
        System.out.println(c);
    }
}