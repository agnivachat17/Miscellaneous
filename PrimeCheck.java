import java.util.Scanner;
class PrimeCheck
{
   public static void main(String args[])
   {		
      Scanner sc=new Scanner(System.in);
      int n;
      System.out.println("Enter a positive number");
      do{
          n=sc.nextInt();
        }while(n<=0);
      int f=0;
      for(int i=1;i<=n/2;i++)
      {
          if(n%i==0)
          {
              f++;
          }
      }
      if(f==1)
      {
          System.out.println("It is a prime number");
      }
      else
      {
          System.out.println("It is not a prime number");
      }
   }
}