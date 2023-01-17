//Sum of the factorial of the numbers
import java.util.*;
class Recur_SumOfFac
{
    int fact(int n)
    {
        if(n==0||n==1)
        return 1;
        return n*fact(n-1);
    }
    int sum(int n)
    {
        if(n==1)
            return 1;
        return fact(n)+sum(n-1);
    }
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        Recur_SumOfFac fs=new Recur_SumOfFac();
        System.out.println("Enter any number :");
        System.out.println("Sum = "+fs.sum(sc.nextInt()));
    }
}