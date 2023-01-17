import java.util.*;
class BubleSort_2DArray
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter number of columns in the array:");
        int c=sc.nextInt();
        System.out.println("Enter number of rows in the array:");
        int r=sc.nextInt();
        int arr[][]=new int[r][c];
        int brr[]=new int[r*c];
        int k=0, temp;
        System.out.println("Enter elements of the array:");
        for(int i=0;i<r;i++)
        {
            for(int j=0;j<c;j++)
            {
                arr[i][j]=sc.nextInt();
                brr[k]=arr[i][j];
                k++;
            }
        }
        System.out.println("Original contents of the array:");
        k=0;
        for(int i=0;i<r;i++)
        {
            for(int j=0;j<c;j++)
            {
                arr[i][j]=brr[k];
                k++;
                System.out.print(arr[i][j]+"\t");
            }
            System.out.println();
        }
        for(int i=0;i<brr.length-1;i++)
        {
             for(int j=1;j<brr.length-i-1;j++)
             {
                  if(brr[j-1]>brr[j])
                  {
                     temp=brr[j-1];  
                     brr[j-1]=brr[j];  
                     brr[j]=temp;   
                  }
             }
        }
        k=0;
        System.out.println("New contents of the array:");
        for(int i=0;i<r;i++)
        {
            for(int j=0;j<c;j++)
            {
                arr[i][j]=brr[k];
                k++;
                System.out.print(arr[i][j]+"\t");
            }
            System.out.println();
        }
    }
}
