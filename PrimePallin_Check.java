import java.util.*;
public class PrimePallin_Check
{
    public static boolean isPrime(int n)
    {
        int f=0;
        for(int i=1; i<=n/2; i++)
            if(n%i==0)
                f++;
        return(f==1); 
    }
    public static boolean isPallin(int n)
    {
        int m=n,r=0;
        while(m>0)
        {
            r=r*10+(m%10);
            m=m/10;
        }
        return (r==n);    
    }
    public static void main(String args[])
    {
        Scanner sc= new Scanner(System.in);
        int a=0;
        int arr[]=new int[10];
        System.out.println("Enter the numbers:");
        for(int i=0; i<10;i++)
            arr[i]=sc.nextInt();
        for(int i=0; i<10;i++)
            if((isPrime(arr[i])==true)&&(isPallin(arr[i])==true))
            {
                System.out.println(arr[i]);
                a=1;
            }
        if(a==1)
            System.out.println("All these numbers above are prime pallindromic numbers");
        else
            System.out.println("There are no prime pallindromic numbers");
    }
}