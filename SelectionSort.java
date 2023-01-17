import java.util.*;
class SelectionSort
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.print("\n Enter the number of integers :");
        int n=sc.nextInt();
        int num[]=new int[n];
        System.out.print("\n Enter the numbers from the user :");
        for(int i=0;i<n;i++)
            num[i]=sc.nextInt();       
        System.out.println("\n Original List of Numbers :");
        for(int i=0;i<n;i++)
            System.out.print(num[i]+",");
        // code for Selection Sort begins here
        // ---------------------------------
        for (int i = 0; i < n-1; i++) 
        { 
            // Find the index of the minimum element in unsorted array 
            int min_idx = i; 
            for (int j = i+1; j < n; j++) 
                if (num[j] < num[min_idx]) 
                    min_idx = j; 
  
            // Swap the found minimum element with the first element
            if(min_idx!=i)
            {
            int temp = num[min_idx]; 
            num[min_idx] = num[i]; 
            num[i] = temp; 
            }
        } 
        System.out.println("\n Final List of Numbers :");
        for(int i=0;i<n;i++)
        System.out.print(num[i]+",");
    }
}    