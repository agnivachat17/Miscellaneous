import java.util.*;
public class isHappyNumber_justnotsquared_OrMagicNumber {      
    public static boolean square(int num)
    { 
            return(num%9==1);
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