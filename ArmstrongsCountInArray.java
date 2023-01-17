import java.io.*;
class ArmstrongsCountInArray
{
    public static void main(String args[])throws IOException
    {
        InputStreamReader isr=new InputStreamReader(System.in);
        BufferedReader br=new BufferedReader(isr);
        System.out.print("\n Enter the size of the array :");
        int sz=Integer.parseInt(br.readLine());
        int arr[]=new int[sz];
        int cnt=0; // counts the number of Armstrong numbers withi the array
        Integer in=new Integer(23);
        System.out.print("\n Value of in :"+in);
        /*
        for(int i=0;i<sz;i++)
        {
            int x=0;
            do
            {
                x=(int)(Math.random()*1000);
            }while(x<100 || x>=1000);
            arr[i]=x;
        }
        */
        System.out.print("\n Enter the elements of the array :\n");
        for(int i=0;i<sz;i++)
            arr[i]=Integer.parseInt(br.readLine());
        System.out.print("\n Contents of the array :\n");
        for(int i=0;i<sz;i++)
            System.out.print(arr[i]+",");
        for(int i=0;i<sz;i++)
        {
            int num=arr[i],c=0,d=0,s=0;
            // loop to count the number of digits of 'num'
            while(num>0)
            {
                c++;
                num=num/10;
            }
            num=arr[i];
            System.out.println("c ="+c);
            // loop to find the sum of the nth power of the digits of the number
            while(num>0)
            {
                d=num%10;
                num=num/10;
                s=s+(int)Math.pow(d,c);
            }
            // checks whether the sum is equal to the original number or not
            if(s==arr[i])
            {
                System.out.println("\n Armstrong Number "+arr[i]);
                cnt++; // increases the count of Armstrong Numbers in the array
            }
        }
        System.out.print("\n Number of Armstrong Numbers are :"+cnt);
    }
}