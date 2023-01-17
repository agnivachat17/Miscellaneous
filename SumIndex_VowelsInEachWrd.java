/* PROGRAM TO ACCEPT ANY SENTENCE AND DISPLAY THE WORDS ALONGWITH THE SUM OF THE INDEX OF THE 
 * VOWELS PRESENT IN EACH WORD. ALSO DISPLAY THE WORD HAVING THE HIGHEST SUM OF THE INDEX. */
import java.util.*;
class SumIndex_VowelsInEachWrd
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.print("\n Enter any sentence :");
        String s=sc.nextLine();
        s=s.toLowerCase();
        s=s.trim()+" ";
        int len=s.length();
        int sm=0,smx=0,j=0;
        String temp="",wrd="";
        
        for(int i=0;i<len;i++)
        {
            char ch=s.charAt(i);
            if(ch!=' ')
            {
                
                if("aeiou".indexOf(ch)!=-1)
                    sm=sm+j;
                temp=temp+ch;
                j++;
            }
            else
            {
                System.out.print("\n "+temp+" ----> "+sm);
                if(sm>smx)
                {
                    smx=sm;
                    wrd=temp;
                }
                sm=0;
                j=0;
                temp="";
            }
        }
        System.out.print("\n Max word :"+wrd);
        System.out.print("\n Max Vowel Index :"+smx);
    }
}