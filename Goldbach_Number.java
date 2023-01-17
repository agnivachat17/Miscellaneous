import java.util.*;
class Goldbach_Number
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter an even integer between 9 and 50:");
        int N=sc.nextInt();
        if(N<=9||N>=50)
        {
            System.out.println("INVALID INPUT. NUMBER IS OUT OF RANGE.");
            System.exit(0);
        }
        else if(N%2!=0)
        {
            System.out.println("INVALID INPUT. NUMBER IS ODD.");
            System.exit(0);
        }
        System.out.println("PRIME PAIRS ARE:");
        for(int i=3;i<=N/2;i+=2)
        {
            if(isPrime(i)&&isPrime(N-i))
            System.out.println(i+","+(N-i));
        }
    }
    public static boolean isPrime(int x)
    {
        int c=0;
        for(int i=1;i<=x/2;i++)
        {
            if(x%i==0)
            c++;
            if(c>1)
            return false;
        }
        return true;
    }
}