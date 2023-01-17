import java.util.*;
public class AllDisarium
{
    private int n;
    private int x,y;
    public AllDisarium()
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
    public int getSum(int n)
    {
        int m=n,c=0;
        while(m>0)
        {
            c++;
            m=m/10;
        }
        int a=n,s=0;
        while(a>0)
        {
            s=s+(int)(Math.pow((a%10),(c--)));
            a=a/10;
        }
        return s;
    }
    public boolean isDisarium(int n)
    {
        return n==(getSum(n))?true:false;
    }
    public void display()
    {
        System.out.println("All DISARIUM NUMBERS:");
        for(int i=x;i<=y;i++)
        {    
           if(isDisarium(i)==true)
           System.out.println(i);
        }
    }
}
class InitAllDisarium
{
    public static void main(String args[])
    {
        AllDisarium f=new AllDisarium();
        f.takeRange();
        f.display();
    }
}