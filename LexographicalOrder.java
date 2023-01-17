import java.util.Scanner;
class LexographicalOrder
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.print("\n Enter any sentence :");
        String s=sc.nextLine();
        s=s.trim()+" ";
        int len=s.length();
        int k=0;
        //String w[]
        String temp="";
        String w[]=s.split(" ");
        int c= w.length;
        // code for arranging the list of words in 'w' using bubble sorting technique
        // --------------------------------------------------------------------------
        for(int i=0;i<c-1;i++)
        {
            for(int j=0;j<c-i-1;j++)
            {
                // code to compare two words to find which appears before the other in dictionary order
                if(w[j].compareToIgnoreCase(w[j+1])>0)    
                {
                    // swap the contents between jth and (j+1)th element within the array
                    temp=w[j];
                    w[j]=w[j+1];
                    w[j+1]=temp;
                }
            }
        }
         String newsent="";
        // loop to form the new sentence containing the sorted list
        for(int i=0;i<c;i++)
            newsent+=w[i]+" ";            
        System.out.print("\n New sentence is :"+newsent); // displays the new sentence
    }
}