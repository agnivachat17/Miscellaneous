/*
 * The marks obtained by 50 students in a subject are tabulated as follows
Name                          Marks
---                                ---
---                                ---
Write a program to input the names and marks of the students in the subject.
Calculate and display;-
i.                    The subject average marks( Subject average marks= subject total/50)
ii.                  The highest marks in the subject and the name of the student
The maximum marks in the subject are 100. 
 */
import java.util.Scanner;
class HighestMarksAmongStudents
{
    public static void main(String args[])
    {
        final int SIZE=5;
        Scanner sc=new Scanner(System.in);
        String names[]=new String[SIZE];
        int avgmks[]=new int[SIZE];
        int k=0;
        System.out.print("\n Enter details of each students :");
        for(int i=0;i<SIZE;i++)
        {
            System.out.print("\n Enter name of Student ::"+(i+1));
            names[i]=sc.next();
            System.out.print("\n Enter Average Marks scored :");
            avgmks[i]=sc.nextInt();
        }
        for(int i=1;i<SIZE;i++)
        {
            if(avgmks[i]>avgmks[k])
                k=i;
        }
        System.out.print("\n Student with Highest Marks :\n");
        System.out.print("Name :"+names[k]+"\t Marks "+avgmks[k]);
    }
}