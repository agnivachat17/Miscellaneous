/* WAP TO ACCEPT THE SIZE OF THE ARRAY AND INSERT THE ELEMENTS INTO THE ARRAY IN SUCH AN ARRAY SUCH THAT 
 * THE ARRAY IS IN AN ASCENDING SORTED ORDER.
 */

import java.util.Scanner;
class AutoSort
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.print("\n Enter the size of the array :");
        int sz=sc.nextInt(); // accepts the size from the user
        
        int arr[]=new int[sz];
        int i=1,j=0;
        System.out.print("\n Enter the elements of the array :");
        arr[0]=sc.nextInt(); // accepts the first value and stores it in position 0
        do
        {
            int x=sc.nextInt(); // accepts the value from the user
            // loop runs till the new value is compared with the already entered values in the array.
            for(j=0;j<i;j++) 
            {
                if(x>arr[j])
                    continue;
                else
                {
                    for(int k=i-1;k>=j;k--) // shifts the value to right to create place for the new value
                    {
                        arr[k+1]=arr[k];
                    }
                    break; // breaks out of the loop after making space for the new value
                }
            }
            arr[j]=x; // inserts the new value into its right place
        }while(++i<sz);  // loop runs until all the values are entered into the array
 
        System.out.print("\n The contents of the array :\n");
        for(i=0;i<sz;i++)
        System.out.print(arr[i]+",");
   }  // end of the main() function
} // end of the class