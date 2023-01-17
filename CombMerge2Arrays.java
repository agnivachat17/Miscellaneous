/*First Array : 10, 20, 30 ,40
Second Array : 15,25,35,45,55,65,75,85,95,105,115,125
Merged Array : 10,15,20,25,30,35,40,45,55,65,75,85,95,105,115,125
Comb Merging
*/
import java.util.Scanner;
class CombMerge2Arrays
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.print("\n Enter the size of the first array :");
        int sz1=sc.nextInt();
        int arr[]=new int[sz1];
        System.out.print("\n Enter the elements of first array :");
        for(int i=0;i<sz1;i++)
        {
         arr[i]=sc.nextInt();
        }
        System.out.print("\n Enter the size of the second array :");
        int sz2=sc.nextInt();
        int brr[]=new int[sz2]; 
        System.out.print("\n Enter the elements of second array :");
        for(int i=0;i<sz2;i++)
        {
            brr[i]=sc.nextInt();
        }
        // merging process begins here
        int crr[]=new int[sz1+sz2];
        int i=0,j=0,k=0;
        for(;i<sz1 && j<sz2;)
        {
            crr[k++]=arr[i++]; // stores a value from arr in kth position in crr array
            crr[k++]=brr[j++];  // stores next value from brr in (k+1)th position in crr array
        }
        if(i==sz1) // checks whether all elements of the first array have been stored in merged array
        {
            while(j<sz2) // stores all the remaining elements from second array into the merged array
                crr[k++]=brr[j++];
        }
        else  // works for storing all the elements of the first array into merged array
        {
            while(i<sz1) // works when all the elements of second array is already stored in merged array 
                crr[k++]=arr[i++];   //stores all the remaining elements from first array into the merged array
        }
        System.out.print("\n Contents of the merged Array :\n");        
        for(i=0;i<sz1+sz2;i++)
        System.out.print(crr[i]+",");
    }
}