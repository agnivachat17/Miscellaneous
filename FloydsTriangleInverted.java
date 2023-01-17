import java.util.*;
public class FloydsTriangleInverted
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner (System.in);
        System.out.println("Enter the number of rows");
        int n=sc.nextInt();
        int s=n*((n+1)/2);
        int a=1;
        for(int i=n;i>=1;i--)
        {
            for(int j=1;j<=n-i;j++)
            {
                System.out.print(" ");
            }
            for(int k=1;k<=i;k++)
            {
                System.out.print(s+" ");
                s--;
            }
            System.out.println();
        }
    }
}