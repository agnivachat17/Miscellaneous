import java.util.*;
public class WellOrderedCheck
{
    private int n;
    public WellOrderedCheck()
    {
        n=0;
    }
    public void accept()
    {
        Scanner sc= new Scanner(System.in);    
        System.out.println("Enter a number");
        n=sc.nextInt();
    }
    public boolean isOrdered(int n)
    {
        int m=n;
        int x=m%10;
        m=m/10;
        int d=0;
        while(m>0)
        {
            d=m%10;
            if(x<d)
            {
               return false;
            }
            m=m/10;
            x=d;
        }  
        return true;
    }
    public void display()
    {
       if(isOrdered(n)==true)
       System.out.println(n+" is a WELL ORDERED number");
       else
       System.out.println(n+" is not a WELL ORDERED number"); 
    }
}
class InitWellOrdered
{
    public static void main(String args[])
    {
        WellOrderedCheck obj = new WellOrderedCheck();
        obj.accept();
        obj.display();
    }
}
