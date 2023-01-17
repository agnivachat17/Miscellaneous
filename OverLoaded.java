import java.util.Scanner;
class OverLoaded
{
    public void area(int len)
    {
        int ar=len*len;
        System.out.print("\n Area of square :"+ar);
    }
    public int area(int len, int brd)
    {
        int ar=len*brd;
        return ar;
    } 
    public float area(float r,float h)
    {
        float ar=(float)(2*Math.PI*r*(h*r));
        return ar;
    }
    public double area(double r)
    {
        double ar=Math.PI*r*r;
        return ar;
    }
    public static void main(String args)
    {
        OverLoaded ov=new OverLoaded();
        Scanner sc=new Scanner(System.in);
        System.out.print("\n Enter the length of side of square :");
        int ln=sc.nextInt();
        ov.area(ln); // calls the area() for square
        System.out.print("\n Enter the length and breadth of rectangle :");
        ln=sc.nextInt();
        int bd=sc.nextInt();
        int a1=ov.area(ln,bd); // calls the area() fr rectangle
        float a2=ov.area(3.45f, 2.34f); //calls the area for cylinder
        double a3=ov.area(6.5); // calls the area() for circle    
        System.out.print("\n Area of rectangle :"+a1);
        System.out.print("\n Area of cylinder :"+a2);
        System.out.print("\n Area of circle :"+a3);
    }
}