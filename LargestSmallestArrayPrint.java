import java.util.Scanner;
class LargestSmallestArrayPrint
{    
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.print("\n Enter the size of the array :");
        int sz=sc.nextInt();    // accepts the size of the array in 'sz'
        int arr[]=new int[sz]; // creates the array of size 'sz'
        int lg,sm;       
        System.out.print("\nEnter the elements of the array :");
        // loop to accept the elements of the array 
        for(int i=0;i<arr.length;i++)
        {
            arr[i]=sc.nextInt();
        }
        lg=sm=arr[0];       
        for(int i=1;i<arr.length;i++)
        {
            if(arr[i]>lg)
                lg=arr[i];
            else
                if(arr[i]<sm)
                    sm=arr[i];
        }
        System.out.print("\n Largest Number :"+lg);
        System.out.print("\n Smallest Number :"+sm);
    }
}