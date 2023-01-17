
// PROGRAM TO DISPLAY WORDS HAVING ODD LENGTHS ONLY
// -------------------------------------------------

import java.util.*;

class OddLengthWordsDisplay
{
    static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.print("\n Enter any sentence :");
        String s=sc.nextLine();
        s=s+" ";
        int l=s.length(),c=0;
        String temp="";
        for(int i=0;i<l;i++)
        {
            char ch=s.charAt(i);
            if(ch!=' ')
                temp=temp+ch;
            else
            {
                if(temp.length()%2!=0)
                c++;
                temp="";
            }
        }
        System.out.print("\n Number of words with odd Length :"+c);
    }
}