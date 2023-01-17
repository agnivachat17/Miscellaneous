/*WAP TO ACCEPT ANY 10 INTEGERS IN AN ARRAY AND ARRANGE THE FIRST 5 INETGERS IN DESCENDING ORDER AND THE NEXT 5 ELEMENTS IN 
  ASCENDING ORDER. IF THE SIZE OF THE ARRAY 'N' IS ODD , THEN ARRANGE THE FIRST N/2+1 ELEMENTS IN DESCENDING ORDER AND THE 
  REST IN ASCENDING ORDER.*/
import java.util.*;
class ArrayPartialSorting
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
        /* int num[]={28,38,98,40,74,56,90,20,11,37};
        int n=num.length; */
        System.out.println("\n Original List of Numbers :");
        for(int i=0;i<n;i++)
            System.out.print(num[i]+",");
        // code for Bubble Sort begins here
        // ---------------------------------
        int mid=n/2;
        for(int i=0;i<mid-1;i++)
        {
            for(int j=0;j<mid-i-1;j++)
            {
                if(num[j]<num[j+1]) // if jth element is greater tha (j+1)th element, then swap the values
                {
                    int temp=num[j];
                    num[j]=num[j+1];
                    num[j+1]=temp;
                }
            }
        }
        // sorting the right part of the array in ascending order
        for(int i=mid;i<mid+n-1;i++)
        {
            for(int j=mid;j<mid+n-i-1;j++)
            {
                if(num[j]>num[j+1]) // if jth element is greater tha (j+1)th element, then swap the values
                {
                    int temp=num[j];
                    num[j]=num[j+1];
                    num[j+1]=temp;
                }
            }
        }
        System.out.println("\n Final List of Numbers :");
        for(int i=0;i<n;i++)
        System.out.print(num[i]+",");
    }
}