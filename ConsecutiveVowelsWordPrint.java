// WAP TO ACCEPT ANY 'n' WORDS AND DISPLAY ALL THE WORDS WHICH HAS CONSECUTIVE  LETTERS WHICH ARE VOWELS.
import java.util.*;
class ConsecutiveVowelsWordPrint
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.print("\n Enter a sentence:");
        String s=sc.nextLine();
        String words[]=s.split(" ");
        int sz=words.length;
        int flag=0;
        System.out.println();
        for(int i=0;i<sz;i++)
        {
            for(int j=0;j<words[i].length()-1;j++)
            {
                char ch1=words[i].charAt(j);
                char ch2=words[i].charAt(j+1);
                if(ch1==ch2)
                {
                    if("aeiouAEIOU".indexOf(ch1)!=-1)
                    {
                        System.out.print(words[i]+",");
                        flag=1;
                        break;
                    }
                }
            }
        }
        if(flag==0)
            System.out.println("No words with consecutive equal vowels");
    }
}