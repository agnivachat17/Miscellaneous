import java.util.*;
public class oddIndexCapital
{
    public static void main(String args[])
    {
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter the sentence");
        String str=sc.nextLine();
        str=str.trim();
        str=str.toLowerCase();
        str=" "+str+" ";
        int len=str.length(),l=0;
        int c=0;
        char ch=' ',ch1=' ',ch2=' ';
        String temp="",newl="",conf="";
        for(int i=0;i<len;i++)
        {
            ch=str.charAt(i);
            if(ch==' ')
            {
                c++;
            }
            else
            {
                for(;;i++)
                {
                    ch1=str.charAt(i);
                    if(ch1==' ')
                        break;
                    temp=temp+ch1;
                }
                i=i-1;
                if(c%2!=0)
                {
                    l=temp.length();
                    for(int j=0;j<l;j++)
                    {
                        ch2=temp.charAt(j);
                        if(j%2==0)
                        {
                            ch2=Character.toUpperCase(ch2);
                        }
                        newl=newl+ch2;
                    }
                    temp="";
                    conf=conf+newl+" ";
                    newl="";
                }
                else
                {
                    conf=conf+temp+" ";
                    temp="";
                }
            }
        }
        System.out.println("New Sentence:"+conf);
    }
}