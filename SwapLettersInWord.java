import java.util.Scanner;
class SwapLettersInWord
{
    public static void main()
    {
            Scanner sc=new Scanner(System.in);
            System.out.print("\n Enter any word :");
            String s=sc.next();
            boolean flag=false;
            int len=s.length();
            String str="";
            if(s.length()%2!=0)
            {   
                flag=true;
                len--;
            }            
            for(int i=0;i<len;i+=2)
            {
                char ch1=s.charAt(i);
                char ch2=s.charAt(i+1);
                str=str+ch2+ch1;
            }
            if(flag==true)
                str=str+s.charAt(len);
            System.out.print("\n Final Word :"+str);
    }
}