import java.util.*;
public class Krishnamurthy_Check
{
    int getFactorial(int n)
    { 
        if(n==0||n==1)
           return 1;
        else
           return (n*getFactorial(n-1));
    }
    int l,c;
    boolean Krishnamurthy_Check(int n)
    {
        l=n;
        if(l>0)
        {   
            c=c+getFactorial(l%10);
            Krishnamurthy_Check(l/10);
        }
        return (c==n);
    }
    public void display()
    {
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter a number");
        int n=sc.nextInt();
        if(Krishnamurthy_Check(n)==true)
        System.out.println("Yes it is a Krishnamurthy Number");
        else
        System.out.println("No it is not a Krishnamurthy Number");
    }
}