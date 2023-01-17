import java.util.*;
class ReportCard_GradingOnMarks
{
    private int m1,m2,m3;
    private String name;
    public ReportCard_GradingOnMarks()
    {
        name=null;
        m1=m2=m3=0;
    }
    public ReportCard_GradingOnMarks(String nm,int x,int y,int z)
    {
        name=nm;
        m1=x;
        m2=y;
        m3=z;
    }
    public void accept()
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter your name");
        name=sc.nextLine();
        System.out.println("Enter marks of 3 subjects");
        m1=sc.nextInt();
        m2=sc.nextInt();
        m3=sc.nextInt();
    }
    public int getAvg()
    {
        int av=(m1+m2+m3)/3;
        return av;
    }
    public char getGrade()
    {
        int a=getAvg();
        char g=' ';
        if(a>=85)
        {
            g='A';
        }
        if(a>=70&&a<85)
        {
            g='B';
        }
        if(a>=50&&a<70)
        {
            g='C';
        }
        if(a>=40&&a<50)
        {
            g='D';
        }
        else if(a<40)
        {
            g='F';
        }
        return g;
    }
    public void displayCard()
    {
     System.out.println("Name:"+name);
     System.out.println("Average:"+getAvg());
     System.out.println("Grade:"+getGrade());
    }
}
class Initreport
{
    public static void main (String args[])
    {
        ReportCard_GradingOnMarks r=new ReportCard_GradingOnMarks();
        r.accept();
        r.displayCard();
    }
}