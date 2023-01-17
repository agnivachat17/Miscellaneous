import java.util.*;
public class AllArmstrong
{
    private int x,y;
    public AllArmstrong()
    {
        x=y=0;
    }
    public void takeRange()
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the lower limit");
        x=sc.nextInt();
        System.out.println("Enter the upper limit");
        y=sc.nextInt();
    }
    public int countDigits(int n)
    {
        int c=0;
        int m=n;
        while(m>0)
        {
            c++;
            m=m/10;
        } 
        return c;
    }
    public boolean isArmstrong(int n)
    {
        int s=0,a,d,m=n;
        d= countDigits(n);
        while(m>0)
        {
           a=m%10;
           s=s+(int)(Math.pow(a,d));
           m=m/10;
        }
        if(s==n)
        return true;
        else
        return false;
    }
    public void display()
    {
        System.out.println("All ARMSTRONG NUMBERS:");
        for(int i=x;i<=y;i++)
        {    
           if(isArmstrong(i)==true)
           System.out.println(i);
        }
    }
}
class InitAllArmstrong
{
    public static void main(String args[])
    {
        AllArmstrong obj=new AllArmstrong();
        obj.takeRange();
        obj.display();
    }
}