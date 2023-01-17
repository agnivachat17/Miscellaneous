/*
 * Write a program in Java to store 10 numbers (including positive and negative numbers) 
 * in a Single Dimensional Array (SDA). Display all the positive numbers followed by the 
 * negative numbers without changing the order of the numbers.
 */
import java.util.*;
class DispPositiveThenNegative
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int arr[]=new int[10];  // creates an array of size 10 to store 10 integers
        int p=0,n=0;    // counters to store number of positive and negative numbers
        System.out.print("\n Enter 10 numbers :");
        // loop to accept only postive or negative numbers, no 0 is to be stored in the array
        for(int i=0;i<10;i++)
        {
            arr[i]=sc.nextInt(); // accepts a number from the user
            if(arr[i]==0) // checks whether the number is 0 or not
            {
                System.out.print("\n Invalid Input 0 is entered ...\n");
                i--;
                continue; // continues to the beginning of loop if entered number is 0.
            }
            else
            if(arr[i]>0)
                p++;        // increments 'p' if entered number is positive
            else
                n++;        // increments 'n' if entered number is negative
        }
        int pos[]=new int[p]; // an array to store all the positive numbers
        int neg[]=new int[n];   // an array to store all the negative numbers
        // loop to separate all the positive and negative numbers into pos[] and neg[] array respectively
        for(int i=0,j=0,k=0;i<10;i++)
        {
            if(arr[i]>0)
                pos[j++]=arr[i];    // stores all the positive numbers in 'pos'from 'arr'
            else
                neg[k++]=arr[i];    // stores all the negative numbers in 'neg' from 'arr'
        }  
        // stores all the positive numbers from 'pos' to 'arr'
        for(int i=0;i<p;i++)
        {
            arr[i]=pos[i];
        }               
        // stores all the positive numbers from  'neg' to 'arr'
        for(int i=0;i<n;i++)
        {
            arr[p+i]=neg[i];
        }       
        System.out.print("\n Contents of the Merged Array :\n");
        for(int i=0;i<10;i++)
            System.out.print(arr[i]+",");
   }
}