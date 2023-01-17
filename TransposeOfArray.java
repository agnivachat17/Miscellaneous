import java.util.*;
class TransposeOfArray
{//start of class
    private int arr[][], m, n;
    public TransposeOfArray()//non-parameterized constructor
    {
        m=0;
        n=0;
        arr=new int[m][n];
    }
    public TransposeOfArray(int mm,int nn)//parameterized constructor
    {
        m=mm;
        n=nn;
        arr=new int[m][n];
    }
    //function to enter the elements of the array
    public void fillarray()
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the elements of the array:");
        for(int i=0;i<m;i++)
        {
            for(int j=0;j<n;j++)
            arr[i][j]=sc.nextInt();
        }
    }
    //function to find the transpose of an array
    public void transpose(TransposeOfArray A)
    {
        for(int i=0;i<m;i++)
        {
            for(int j=0;j<n;j++)
            this.arr[i][j]=A.arr[j][i];
        }
    }
    //function to display an array
    public void disaparray()
    {
        for(int i=0;i<m;i++)
        {
            for(int j=0;j<n;j++)
            System.out.print(arr[i][j]+"\t");
            System.out.println();
        }
    }
    public static void main(String args[])
    {//start of main
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number of rows:");
        int a=sc.nextInt();
        System.out.println("Enter the number of columns:");
        int b=sc.nextInt();
        while(a>20||b>20)
        {
            if(a>20&&b>20)
            {
                System.out.println("Invalid Input. Enter the number of rows and columns:");
                a=sc.nextInt();
                b=sc.nextInt();
            }
            else if(a>20)
            {
                System.out.println("Invalid Input. Enter the number of rows:");
                a=sc.nextInt();
            }
            else
            {
                System.out.println("Invalid Input. Enter the number of columns:");
                b=sc.nextInt();
            }
        }
        TransposeOfArray ob=new TransposeOfArray(a,b);//object of the class
        TransposeOfArray obj=new TransposeOfArray(b,a);//object of the class
        ob.fillarray();
        ob.disaparray();
        obj.transpose(ob);
        System.out.println("The Transpose of the array:");
        obj.disaparray();
    }//end of main
}//end of class