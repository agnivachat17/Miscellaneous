// PROGRAM TO DISPLAY THE LONGEST WORD WITHIN A SENTENCE ACCEPTED FROM THE USER.
// IF THE SENTENCE CONTAINS MORE THAN ONE WORD WHICH IS THE LONGEST THEN ONLY THE FIRST SUCH
// ENCOUNTERED WORD IS ONLY DISPLAYED.
import java.util.*;
class LongestWordDisplay
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.print("\n Enter any sentence :");
        String s=sc.nextLine(),temp="",news="";
        s=s.trim()+" ";
        int len=s.length();
        int l,newl=0;
        char c=' ';
        for(int i=0;i<len;i++)
        {
            c=s.charAt(i);
            if(c!=' ')
                temp+=c;
            else
            {
                l=temp.length();
                if(l>=newl)
                {
                    newl=l;
                    news=temp;
                }
                temp=" ";
            }
        }
        System.out.print("\n Longest Word :"+news+" "+newl);
    }
}