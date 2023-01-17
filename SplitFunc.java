import java.util.Scanner;
class SplitFunc
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.print("\n Enter any sentence :");
        String s=sc.nextLine();
        String w[];
        String arr[] =s.split(" ");
        System.out.print("\n Words in array: :");
        for(int i=0;i<=(arr.length)-1;i++)
        {
            System.out.println(arr[i]);
        }
    }
}