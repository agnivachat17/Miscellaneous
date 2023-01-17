import java.util.*;
public class Cumulative_Sum_Of_Digits
{
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
          public void display()
    {
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter n");
        int n=sc.nextInt();
      
        System.out.println("Cumulative Sum Of Digits:"+sumOfDigits(n));
        
    }
}