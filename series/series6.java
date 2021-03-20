import java.util.Scanner;
public class alle
{ //S =1/(1*3) +1/(1*3*5) +1/(1*3*5*7)...n
    public static void main(String args[])
    {
        Scanner sc= new Scanner(System.in);
        double a=1,b,x=3,i,n,s=0;
        System.out.println("enter a number");
        n=sc.nextInt();
        for(i=1;i<=n;i++)
        {
          a=a*x;
          b=1/a;
          s=s+b;
          x=x+2;
            }
            
            System.out.println(s);
    }
}