/*
 * A positive n digit number X is called a Keith number (or repfigit number) 
 * if it is arranged in a special number sequence generated using its digits. 
 * The special sequence has first n terms as digits of x and other terms are recursively 
 * evaluated as the sum of previous n terms. For example, 197, 19, 742, 1537, etc.
 * 1, 9, 7, 17, 33, 57, 107, 197, ...
 * Some keith numbers are: 14 ,19, 28 , 47 , 61, 75, 197, 742, 1104, 1537……………
 * 1+9+7=17
 * 9+7+17=33
 * 7+17+33=57
 * 17+33+57=107
 * 33+57+107=197
 * Write a Program in Java to input a number and check whether it is a Keith Number or not. 
 * 
 */
import java.io.*;
class KeithNum
{
    public static int countDigs(int x)
    {
        int cnt=0;
        while(x>0)
        {
            cnt++;
            x/=10;
        }
        return cnt;
    }
    public static void main()throws IOException
    {
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        System.out.print("Enter the number: "); //inputting the number
        int n=Integer.parseInt(br.readLine());
        int copy=n;
        int d=countDigs(n); //finding the number of digits (d) in the number
        int arr[]=new int[d]; //array for storing the terms of the series
        for(int i=d-1; i>=0; i--)
        {
            arr[i]=copy%10; //storing the digits of the number in the array
            copy=copy/10;          
        }
        int i=d,sum=0;
        while(sum<n) //finding the sum till it is less than the number
        {
            sum = 0;
            for(int j=0; j<d; j++) //loop for generating and adding the previous 'd' terms
            {
                 sum=sum+arr[j];
            }
            for(int j=0;j<d-1;j++) // loop for shifting the elements one place left from right
            {
                arr[j]=arr[j+1];
            }
            arr[i-1]=sum; //storing the sum in the array
        }
        /* When the control comes out of the while loop, either the 
          sum is equal to the number or greater than it */
        if(sum==n) //if sum is equal to the number, then it is a Keith number
            System.out.println("The number is a Keith Number");
        else
            System.out.println("The number is a not a Keith Number");
    }
}