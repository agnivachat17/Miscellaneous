import java.util.*;
class Square_AllFunctions
{
    private int l;
    public Square_AllFunctions()
    {
        l=0;
    }
    public Square_AllFunctions(int x)
    {
        l=x;
    }
    public void accept()
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("\n Enter the length");
        l=sc.nextInt();
    }
    public void dispPeri()
    {
        int p=4*l;
        System.out.println("Perimeter:"+p);
    }
    public int getArea()
    {
        int ar =l*l;
        return ar;
    }
    public float getDiag()
    {
        float dg= (float)(Math.sqrt(2)*l);
        return dg;
    }
}
class Initsquare
{
    public static void main(String args[])
    {
        Square_AllFunctions sq=new Square_AllFunctions();
        sq.accept();
        sq.dispPeri();
        int a=sq.getArea();
        System.out.println("Area:"+a);
        float d = sq.getDiag();
        System.out.println("Diagnal:"+d);
    }
}
        
