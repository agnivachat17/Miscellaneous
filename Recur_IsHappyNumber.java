import java.util.*;
class Recur_IsHappyNumber
{
    private int n;
    public Recur_IsHappyNumber()
    {
        n=0;
    }
    public void getnum(int nn)
    {
        n=nn;
    }
    public int sumOf_SquareOfdigits(int x)
    {
        if(x<10)
            return ((int)(Math.pow(x,2)));
        else
            return ((int)(Math.pow(x%10,2))+sumOf_SquareOfdigits(x/10));
    }
    public void ishappy()
    {
        int sum=sumOf_SquareOfdigits(n);
        while(sum>9)
            sum=sumOf_SquareOfdigits(sum);
        if(sum==1)
            System.out.println(n+" is a Happy Number.");
        else
            System.out.println(n+" is not a Happy Number.");
    }
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        Recur_IsHappyNumber ob=new Recur_IsHappyNumber();
        System.out.println("Enter the number to be checked:");
        int a=sc.nextInt();
        ob.getnum(a);
        ob.ishappy();
    }
}