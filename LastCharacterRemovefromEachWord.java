import java.util.*;
// program to remove the last character from every word, provided its length is greater than 3.
class LastCharacterRemovefromEachWord
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.print("\n Enter any sentence :");
        String s=sc.nextLine();
        s=s.trim()+" ";
        int l=s.length(),c=0;
        String temp="",str="";
        for(int i=0;i<l;i++)
        {
            char ch=s.charAt(i);
            if(ch!=' ')
                temp=temp+ch;
            else
            {
                if(temp.length()>=3)
                {
                    for(int j=0;j<temp.length()-1;j++)
                        str=str+temp.charAt(j);
                    str=str+" ";
                }
                else
                    str=str+temp+" ";
                temp="";
            }
        }
        System.out.print("\n New sentence is :"+str);
    }
}