import java.util.*;
public class ExtractingFirstAndTheLastDigit
{
    public static void main (String args[])
    {
        Scanner sc= new Scanner (System.in);
        System.out.println("Enter a number");
        int n=sc.nextInt();
        int l=n%10;
        int m=n;
        int a=0;
        while(m>0)
        {
            a=m%10;
            m=m/10;
        }
        System.out.println("Last digit "+l);
        System.out.println("First digit "+a);
        System.out.println("hj\b");
    }
}         