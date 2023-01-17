//We started off classes in Class X from these programs as given below:
//Accept a name and print it in reverse form. (If name is AMIT, then output is TIMA)
import java.util.*;
class ReverseWord
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a name");
        String n = sc.nextLine();
        int l = n.length();
        String r="";
        for(int i = 0;i<l;i++)       
            r=n.charAt(i)+r;
        System.out.println("Reverse word:"+r);
    }
}











