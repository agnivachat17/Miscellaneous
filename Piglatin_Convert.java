/**
 * In Piglatin a word such as KING becomes INGKAY, TROUBLE becomes OUBLETRAY as so on. 
 * The first vowel of the original word becomes the starting of the translation and 
 * proceeding letter being shifted towards the end and followed by AY. 
 * Word that begins with a vowel is left unchanged. 
 * WAP to accept a word and convert in to Piglatin word.

 */
import java.util.*;
class Piglatin_Convert
{
    public static void main(String args[])
    {
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter a word");
        String n = sc.next();
        n=n.toUpperCase();
        n.trim();
        int p = 0,i;
        for(i = 0;i<n.length();i++)
        {
            char c = n.charAt(i);
            if("AEIOU".indexOf(c)!=-1) 
                break;
        }
        if("AEIOU".indexOf(n.charAt(0))!=-1)
        {
            System.out.println("Piglatin word:"+n+"YAY");
            return;
        }
        System.out.println ("Piglatin word:" + n.substring(i) + n.substring(0,i) + "AY");
    }
}