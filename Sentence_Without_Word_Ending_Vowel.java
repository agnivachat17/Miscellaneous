// program to accept any sentence and form a new sentence using only the
// words which doesn't end with a vowels
// ---------------------------------------------------------------------
import java.util.*;
public class Sentence_Without_Word_Ending_Vowel
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a sentence");
        String s=sc.nextLine(),temp="",str="";
        s=s.toLowerCase();
        s=s.trim()+" ";
        int l=s.length();
        char ch=' ',c=' ';
        System.out.print("New sentence:");
        for(int i=1;i<l;i++)
        {
            ch=s.charAt(i);
            if(ch!=' ')
            {
                temp=temp+ch;
            }
            else
            {
                c=s.charAt(i-1);
                if("aeiou".indexOf(c)==-1)
                {
                    System.out.print(" "+temp+" ");
                    temp="";
                }
            }
        }
    }
}