import java.util.Scanner;
class ifNotPrime_GetNextPrime
{
    public static boolean isPrime(int n)
    {
        int f=0;
        for(int i=1;i<=n/2;i++)
        {
            if(n%i==0)
                f++;
        }
        return (f==1); 
    }
    public static int getNextPrime(int n)
    {
        int m=n+1;
        while(true)
        {
            if(isPrime(m))
                return m;
            m++;
        }
    }
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.print("\n Enter a number:");
        int n=sc.nextInt();
        int s=0;
        if(isPrime(n)==true)
        {
            while(n>0)
            {
                s+=Math.pow((n%10),2);
                n/=10;
            }
            System.out.println("sum of the square of the digits: "+s);
        }
        else
        {
            System.out.println("Next higher prime number: "+getNextPrime(n));
        }
    }
}