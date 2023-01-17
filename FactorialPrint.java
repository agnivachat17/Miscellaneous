import java.util.Scanner;
class FactorialPrint
{
    public static void disp(int n)
    {
        if(n==1)
            System.out.print(n);
        else
        {
             disp(n-1);
             System.out.print("+"+n);
        }
    } 
    public static int facto(int n)
    {
        if(n==1)
            return 1;
        else
        {
            return n*facto(n-1);
        }
    }
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.print("\n Enter any number :");
        int n=sc.nextInt();
        disp(n);
        System.out.print("\n Factorial :"+facto(n));
    }
}