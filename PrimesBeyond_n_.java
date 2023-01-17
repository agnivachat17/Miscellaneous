import java.util.Scanner;
class PrimesBeyond_n_
{
    public static int nextPrime(int m)
    {
        int x=m+1;
        while(true)
        {
            int f=0;
            for(int i=1;i<=x;i++)
            {
                if(x%i==0)
                    f++;
            }
            if(f==2)
                return x;
            x++;
        }
    }
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.print("\n Enter the number of terms:");
        int sz=sc.nextInt();
        int arr[]=new int[sz];
        System.out.print("\n Enter the starting value :");
        int n=sc.nextInt();
        for(int i=0;i<sz;i++)
        {
            arr[i]=nextPrime(n);
            n=arr[i];
        }
        System.out.print("\n List of Prime Numbers :");
        for(int i=0;i<sz;i++)
            System.out.print(arr[i]+",");
    }
}