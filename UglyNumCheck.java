import java.util.*;
class UglyNumCheck
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.print("\n Enter any number :");
        int n=sc.nextInt();
        int i=2;
        //System.out.print("\n The prime factors are :");
        while(n>1)
        {
            if(n%i==0)
            {
                if(!(i==2 || i==3 || i==5))
                {
                    //System.out.print(i+",");
                    System.out.print("\n Not Ugly Number");
                    return;
                }
                //System.out.print(i+",");
                n=n/i;
            }
            else
                i++;
        }
        System.out.print("\n Ugly Number");
    }
}