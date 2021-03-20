import java.util.Scanner;
public class alle
{ //S =1/1 + (1+2)/(1*2) + (1+2+3)/(1*2*3)...n
    public static void main(String args[])
    {
        Scanner sc= new Scanner(System.in);
        double c=0,y=3,b=0,x=1,n,i;
        double s=0,a=1;
        System.out.println("enter a number");
        n=sc.nextDouble();
        for(i=1;i<=n;i++)
        {
            b=b+x;
            a=a*x;
            c=b/a;
            s=s+c;
            x++;
            
            }
            
            System.out.println(s);
        
        
    }
}