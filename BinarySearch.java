import java.util.*;
class BinarySearch //binary search applies only to a fully sorted array
{
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
        
        int low=0,high=sz-1,mid=0;
        
        boolean flag=false;
        
        System.out.print("\n Enter the value to search :");
        int val=sc.nextInt();
        
        System.out.println("\n Contents of the array :");
        for(int i=0;i<sz;i++)
            System.out.print(arr[i]+",");
        
        while(low<=high)
        {
            mid=(low+high)/2;
            //System.out.print("\n Step "+low+" ," + mid+" , "+ high);
            if(arr[mid]==val)
            {
                System.out.print("\n Value found at position :"+(mid+1));
                flag=true;
                break;
            }
            else
            {
                if(arr[mid]<val)
                    low=mid+1;
                else
                    high=mid-1;
            }           
        }
        if(flag==false)
            System.out.print("\n No such value is found in the list ");
    }
}