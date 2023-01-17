//WAP to read a word. Print the position of the first vowel occurring in the word. If there is no vowel in the word then print 'Sorry no vowel'.
import java.util.*;
class positionOFFirstVowel
{
public static void main(String args[])
{
    Scanner sc= new Scanner (System.in);
    System.out.println("Enter a sentence");
    String n=sc.nextLine();
    int l = n.length();
    int p = 0;
    char c=' ';
    for(int i = 0;i<l;i++)
    {
        c = n.charAt(i);
        if("AEIOU".indexOf(c)!=-1)
        {
            p = i+1;
            break;
        }
    }
    if(p==0)
        System.out.println ("Vowel not found");
    else
        System.out.println ("Position of First Vowel "+p);
    }
}