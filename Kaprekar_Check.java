/*
 * A Kaprekar number for a given base is a non-negative integer, 
 * the representation of whose square in that base can be split into two parts 
 * that add up to the original number again. 
 * For instance, 45 is a Kaprekar number, because 452 = 2025 and 20+25 = 45
 */
import java.util.*;
public class Kaprekar_Check
{
    public static int countDigits(int n)
    {
        int c=0;
        while(n>0)
        {
            n/=10;
            c++;
        } 
        return c;
    }
    public static boolean isKaprekar(int n)
    {
        int s= n*n;
        int d=(int)(Math.pow(10,countDigits(n)));
        int x=s/d;
        int y=s%d;
        return ((x+y)==n);
    }
    public static void main(String args [])
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a no.");
        int n=sc.nextInt();
        if(isKaprekar(n)==true)
            System.out.println("Yes it is Kaprekar");
        else
            System.out.println("No,it is not kaprekar");
    }
}