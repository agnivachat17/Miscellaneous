import java.util.*;
public class GeneratePallin
{
    int n;
    Scanner sc=new Scanner(System.in);
    public void accept()
    {
        System.out.println("Enter any non-pallindromic number");
        do{
            n=sc.nextInt();
          }while(isPallin(n)==true);
    }
    public int getRev(int x)
    {
        int a=0,s=0;
        while(x>0)
        {
            a=x%10;
            s=s*10+a;
            x=x/10;
        }
        return s;
    }
    public boolean isPallin(int x)
    {
        return ((getRev(x))==x)? true:false;
    }
    public int getNextPallin()
    {
        int m;
        do{
            m=getRev(n);
            n=n+m;
          }while(isPallin(n)==false);
        return n;
    }
    public void display()
    {
        System.out.println("YOUR PALLINDROMIC NUMBER: "+getNextPallin());
    }
}
class InitGeneratePallin
{
    public static void main(String args[])
    {
        GeneratePallin obj=new GeneratePallin();
        obj.accept();
        obj.display();
    }
}