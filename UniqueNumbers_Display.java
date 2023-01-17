//WRITE A PROGRAM TO STORE N 4DIGIT NUMBERS IN AN ARRAY AND COUNT THE NUMBER OF UNIQUE NUMBERS WITHIN THE ARRAY.
import java.util.Scanner;
class UniqueNumbers_Display
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.print("\n Enter the size of the array :");
        int n=sc.nextInt();
        int arr[]=new int[n];
        int x=0;
        for(int i=0;i<n;i++)
        {
            do
            {
                x=(int)(Math.random()*10000);
            }while(x<1000 || x>=10000);
            arr[i]=x;
        }
        System.out.print("\n List of integers :");
        for(int i=0;i<n;i++)
            System.out.print(arr[i]+",");
        int c=0;
        boolean flag=true;
        for(int i=0;i<n;i++)
        {
            x=arr[i];
            int f=0,d=0;
            flag=true;
            for(int j=0;j<10;j++)
            {
                x=arr[i];
                f=0;
                while(x>0)
                {
                    d=x%10;
                    x=x/10;
                    if(d==j)
                        f++;
                }
                if(f>=2)
                {
                    System.out.print("\n Not a Unique: "+arr[i]);
                    flag=false;
                    break;
                }
            }
            if(flag==true)
                c++;
        }
        System.out.print("\n Number of Unique Numbers in the list :"+c);
    }
}