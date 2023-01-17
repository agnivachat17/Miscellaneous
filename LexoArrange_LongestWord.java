/**
 * Extract each word from a string. The words can be separated by multiple blank spaces. 
 * Store the words in an array and sort them alphabetically. At the end,print the largest word
 */import java.util.*;
class LexoArrange_LongestWord
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a sentence:");
        String s=sc.nextLine();
        s=s.trim();
        String w[]=s.split(" ");
        int c=0,k=0,max=0;
        String temp=" ";
        c=w.length;
        for(int i=0;i<c-1;i++)
        {
            for(int j=0; j<c-i-1; j++)
            {
                if(w[j].compareToIgnoreCase(w[j+1])>0)
                {
                    temp=w[j];
                    w[j]=w[j+1];
                    w[j+1]=temp;
                }
            }
        }
        String newsent=" ";
        for (int i=0;i<c;i++)
        {
                newsent+=w[i]+" ";
                if(w[i].length()>max)
                    max=w[i].length();
        }
        System.out.println("Alphabetically arranged Sentence:"+newsent);
        System.out.println("\nLongest word:");
        for(int i=0;i<c;i++)
        {
            if(w[i].length()==max)
            System.out.println(w[i]+" ");
        }
    }
}