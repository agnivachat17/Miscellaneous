import java.util.Scanner;
class SortWord
{
    public static void main(String args[])
    {
          Scanner sc=new Scanner(System.in);
          System.out.print("\n Enter any word :");
          String s=sc.next();
          int len=s.length();
        
          /*
           char ch[]=new char[len]; // creates a character array of size 'len'
           // loop to store all the letters from word to the array
           for(int i=0;i<len;i++)
          {
               ch[i]=s.charAt(i);
           }
          */
            char ch[]=s.toCharArray();
        
           // code for sorting begins here
           for(int i=0;i<len-1;i++)
           {
                for(int j=0;j<len-i-1;j++)
                {
                    if(ch[j]>ch[j+1])
                    {
                        char c=ch[j];
                        ch[j]=ch[j+1];
                        ch[j+1]=c;
                    }
                }
           }
        
        
          // String()
          // String(String )
          // String(char [])
        
        String nw=new String(ch);
        System.out.print("\n New Word :"+nw);
    }
}