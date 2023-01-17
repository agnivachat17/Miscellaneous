/*
 * Write a program to input a month number and 
 * display month name and number of days in that month.
 */
import java.util.Scanner;
class Month_Name
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        
        String m[]={"January","February","March","April","May","June","July","Aug","September","October","Novenber","December"};
        int days[]={31,28,31,30,31,30,31,31,30,31,30,31};
        System.out.print("\n Enter the month number :");
        int n=sc.nextInt();
        System.out.print("\n Month Name :"+m[n-1]+"\n Number of days in month :"+days[n-1]);
    }
}