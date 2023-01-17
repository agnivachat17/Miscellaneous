/*
 * WAP TO ACCEPT ANY N NUMBERS AND DISPLAY THE THOSE NUMBERS WHICH CONTAINS ALL UNIQUE DIGITS.
 * A UNIQUE NUMBER IS A NUMBER WHICH CONTAINS ALL UNIQUE DIGITS IN IT.
 */
import java.util.Scanner;
class UniqueNumbersInArrayDisp
{  
    public static boolean isUnique(int n)
    {
        int x=0,m=0,d1=0,d2=0;
        while(n>9)
        {
            m=n;
            d1=m%10;
            m=m/10;
            
            while(m>0)
            {
                d2=m%10;
                m=m/10;
                if(d2==d1)
                    return false;
            }
            n=n/10;
        }
        return true;
    }
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.print("\n Enter the size of the array :");
        int sz=sc.nextInt();
        int arr[]=new int[sz];
        System.out.print("\n Enter the elements :");
        for(int i=0;i<sz;i++)
        {
            arr[i]=sc.nextInt();
        }     
        System.out.println("\n Unique numbers :");
        for(int i=0;i<sz;i++)
        {
            if(isUnique(arr[i]))
                System.out.print(arr[i]+",");
        }
    }
}