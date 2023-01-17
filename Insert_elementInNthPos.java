import java.util.*;
class Insert_elementInNthPos
{
    public static void main(String args[])
    {
        Scanner sc=  new Scanner(System .in);
        System.out.println("Enter the size of the original array");
        int sz=sc.nextInt();
        int arr[]=new int [sz];
        System.out.println("Enter the elements of the array");
        for(int i=0;i<=sz-1;i++)
            arr[i]=sc.nextInt();
        System.out.println("Enter the number to be inserted");
        int n=sc.nextInt();
        System.out.println("Enter the position of the number to be inserted");
        int pos=sc.nextInt();
        int arr1[]=new int [sz+1];
        for(int i=0;i<pos-1;i++)
             arr1[i]=arr[i];
        arr1[pos-1]=n;
        for(int i=pos;i<=sz;i++)
             arr1[i]=arr[i-1];
        System.out.println("New array:");
        for(int i=0;i<=sz;i++)
            System.out.println(arr1[i]);
    }
}