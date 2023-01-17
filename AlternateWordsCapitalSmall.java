// PROGRAM TO CAPITALIZE EVERY ALTERNATE WORD IN TOGGLE CASE
// ----------------------------------------------------------
import java.util.*;
class AlternateWordsCapitalSmall
{
    public static void main()
    {
        Scanner sc=new Scanner(System.in);
        System.out.print("\n Enter any sentence :");
        String s=sc.nextLine();
        s=s.trim()+" ";
        int len=s.length();
        int k=0;
        String temp="",str="";
        s=s.toLowerCase();
        for(int i=0;i<len;i++)
        {
            char ch=s.charAt(i);
            if(ch!=' ')
                temp=temp+ch;
            else
            {
                k++;
                if(k%2!=0)
                   temp=temp.toUpperCase();
                else
                    temp=temp.toLowerCase();
                str=str+temp+" ";
                temp="";
            }
        }
        System.out.print("\n The new sentence is :"+str);
    }
}