import java.util.*;
public class UnionIntersection2Arrays
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the size of the first array");
        int sz=sc.nextInt();
        int arr[]=new int[sz];
        System.out.println("Enter the elements of the first array");
        for(int i=0;i<sz;i++)
            arr[i]=sc.nextInt();
        System.out.println("Enter the size of the second array");  
        int sz1=sc.nextInt();
        int arr1[]=new int[sz1];
        System.out.println("Enter the elements of the second array");
        for(int i=0;i<sz1;i++)
            arr1[i]=sc.nextInt();
        int mx=sz>sz1?sz:sz1;
        int irr[]=new int[mx];
        int urr[]=new int[sz+sz1];
        int k=0; 
        int l=0; 
        for(int i=0;i<sz;i++)
            urr[i]=arr[i];
        for(int i=0;i<sz1;i++)
        {
            boolean flag=false;
            for(int j=0;j<sz;j++)
            {
                if(arr1[i]==arr[j])
                {
                    flag=true;
                    irr[k++]=arr1[i];
                    break;   
                }
            }
            if(flag==false)
                urr[sz+l++]=arr1[i];
        }
        System.out.print("\n Union of Two Arrays :\n");
        for(int i=0;i<sz+l;i++)
            System.out.print(urr[i]+",");
        System.out.print("\n Intersection of Two Arrays :\n");
        for(int i=0;i<k;i++)
            System.out.print(irr[i]+",");
    }
}