//Primorial of a number is the product of all the prime numbers below the given number. For eg., Primorial of 5 is= 5*3*2
import java.util.*;
public class Primorial_Print
{
    public static boolean isPrime(int n)
    {
        int c=0;
        for(int i=1;i<=n/2;i++)
            if(n%i==0)
                c++;
        return (c==1);
    }
    public static void main(String args[])
    {
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter a number");
        int n=sc.nextInt();
        int p=1;
        for(int i=n;i>=2;i--)
        {
            if(isPrime(i)==true)
                p*=i;
        }
        System.out.println("Primorial of "+n+" = "+p);
    }
}