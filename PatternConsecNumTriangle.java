/*
 * 
1
12
123
1234
12345
123456
1234567
12345678
123456789
12345678910
 */

import java.util.*;
public class PatternConsecNumTriangle
{
    public static void main(String args[])
    {
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter the number of terms");
        int n= sc.nextInt();
        System.out.println();
        for(int i=1;i<=n;i++)
        {
            for(int j=1;j<=i;j++)
                System.out.print(j);
            System.out.println();
        }
    }
}