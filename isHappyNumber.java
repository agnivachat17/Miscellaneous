import java.util.*;
public class isHappyNumber {
    static boolean square(int n)
    {
        if(n==1)
         return true;
        if(n<4)
           return false;
        int s=0;
        while(n>0)
        {
            s+=(n%10)*(n%10);
            n/=10;
        }
        return square(s);
    }    
    public static void main(String args[])
    {
        Scanner sc=new Scanner (System.in);
        System.out.println("Enter a no");
        int n=sc.nextInt();
        if(square(n))
            System.out.println("Yes");
        else
            System.out.println("No");
    }
}
