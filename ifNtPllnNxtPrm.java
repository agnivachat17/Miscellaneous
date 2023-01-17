import java.util.Scanner;
class ifNtPllnNxtPrm
{
    public static boolean isPallin(int n)
    {
        int m=n,r=0,d=0;
        while(m>0)
        {
            d=m%10;
            m=m/10;
            r=r*10+d;
        }
        return (r==n);    
    }
    public static boolean isPrime(int n)
    {
        int f=0;
        for(int i=1;i<=n/2;i++)
            if(n%i==0)
                f++;
        return (f==1); //it is used 
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
        System.out.print("\n Enter the size of the array :");
        int sz=sc.nextInt();
        int arr[]=new int[sz];
        System.out.print("\n Enter the elements of the array :");
        for(int i=0;i<sz;i++)
            arr[i]=sc.nextInt();
        System.out.print("\n Contents of the array before processing :\n");
        for(int i=0;i<sz;i++)
            System.out.print(arr[i]+",");
        int ctr=0;
        for(int i=0;i<sz;i++)
            if(isPallin(arr[i]))
                ctr++;
            else
                arr[i]=getNextPrime(arr[i]);
        System.out.print("\n Contents of the array after processing :\n");
        for(int i=0;i<sz;i++)
            System.out.print(arr[i]+",");
        System.out.print("\n Number of Pallindromic Numbers :"+ctr);
    }
}