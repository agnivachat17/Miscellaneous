import java.util.*;
public class PallinWordsInSent
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner (System.in);
        System.out.println("Enter any sentence");
        String s=sc.nextLine();
        s=s.trim()+" ";
        int l=s.length(),c=0;
        char ch=' ';
        String a=" ",a1=" ";
        for(int i=0;i<l;i++)
        {
            ch=s.charAt(i);
            if(ch!=' ')
            {
                a=a+ch;   
                a1=ch+a1;
            }
            else
            {
                if(a.equals(a1))              
                    c++;             
                else               
                    System.out.println(a);                      
            }
        }
        System.out.println("No. of pallindromic words: "+c);
        System.out.println("The words which are not pallindromic are displayed above.");
    }
}