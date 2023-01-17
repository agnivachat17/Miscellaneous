import java.util.*;
class ReplaceDuplicateNumberWIth0_Array
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number of elements in the array:");
        int n=sc.nextInt();
        int arr[]=new int[n];
        System.out.println("Enter the elements of the array:");
        for(int i=0;i<n;i++)
        arr[i]=sc.nextInt();
        System.out.print("Original array: ");
        for(int i=0;i<n;i++)
        System.out.print(arr[i]+"\t");
        System.out.println();
        for(int i=0;i<n;i++)
        {
            for(int j=i+1;j<n;j++)
            {
                if((arr[j]!=0)&&(arr[i]!=0))
                {
                    if(arr[i]==arr[j])
                    {
                        arr[j]=0;
                    }
                }
            }
        }
        System.out.print("Modified array: ");
        for(int i=0;i<n;i++)
        System.out.print(arr[i]+"\t");
    }
}