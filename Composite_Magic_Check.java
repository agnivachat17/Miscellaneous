import java.util.*;
class Composite_Magic_Check
{//start of class
    public static void main(String args[])
    {//start of main
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the lower limit:");
        int m=sc.nextInt();
        System.out.println("Enter the upper limit:");
        int n=sc.nextInt();
        int c=0;
        if(m<0||n<0||m>=n)
        {
            System.out.println("INVALID INPUT");
            System.exit(0);
        }
        System.out.println("THE COMPOSITE MAGIC INTEGERS ARE");
        //loop to find the composite magic numbers between m and n(both inclusive)
        for(int i=m;i<=n;i++)
        {
            if(isComposite(i)&&(sumOfDigits(i)==1))
            {
                System.out.print(i+"\t");
                c++;
            }
        }
        if(c==0)
        System.out.println("NO COMPOSITE MAGIC INTEGERS FOUND");
        System.out.println("\nFREQUENCY OF COMPOSITE MAGIC INTEGERS: "+c);
    }//end of main
    //function to check whether a number is composite
    public static boolean isComposite(int x)
    {
        int a=0;
        for(int i=1;i<=x/2;i++)
        {
            if(x%i==0)
                a++;
            if(a>1)
                return true;
        }
        return false;
    }
    //function to find the cumulative sum of the digits of a number y
    public static int sumOfDigits(int y)
    {
        int sum=0, d;
        while(y!=0)
        {
            d=y%10;
            sum+=d;
            y/=10;
        }
        while(sum>9)
            sum=sumOfDigits(sum);
        return sum;
    }
}//end of class