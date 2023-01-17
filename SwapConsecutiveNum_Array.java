import java.util.Scanner;
class SwapConsecutiveNum_Array
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.print("\n Enter the size of the array :");
        int sz=sc.nextInt();
        int arr[]=new int[sz];
        System.out.print("\n Enter the elements of the array :");        
        for(int i=0;i<sz;i++)
        {
            arr[i]=sc.nextInt();
        }       
        System.out.print("\n Original Contents of array is :\n");
        for(int i=0;i<sz;i++)
        {
            System.out.print(arr[i]+",");
        }
        for(int i=0;i+1<sz;)
        {
            int t=arr[i];
            arr[i]=arr[i+1];
            arr[i+1]=t;
            i+=2;   
        } 
        System.out.print("\n New Contents of array is :\n");
        for(int i=0;i<sz;i++)
        {
            System.out.print(arr[i]+",");
        }
    }
}