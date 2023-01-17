import java.util.*;
class Recursion_Series_Sum_Prod_WithPrev
//Series: 1+2*3+4*5*6+7*8*9*10+…….
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number of terms:");
        int n=sc.nextInt();
        int ss=series(n);
        System.out.println("The sum of the series: "+ss);
    }
    public static int sumOfAllPrev(int x)
    {
        if(x==1)
            return 1;
        else
            return (x+sumOfAllPrev(x-1));
    }
        public static int productWithPrev_nth_times(int z,int n)
    {
        if(n==0)
            return 1;
        else
            return (z*productWithPrev_nth_times(z-1,n-1));
    }   
    public static int series(int y)
    {
        if(y==1)
            return 1;
        else
        {
            int s=sumOfAllPrev(y);
            return (productWithPrev_nth_times(s,y)+series(y-1));
        }
    }
}