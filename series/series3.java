import java.util.Scanner;
public class alle
{ //S =(10*1)/3! +(20*3)/5! +(30*5)/7!...n
    public static void main(String args[])
    {
        Scanner sc= new Scanner(System.in);
        double z=1,y=3,b=1,x=10,n,i;
        double s=0,a;
        System.out.println("enter a number");
        n=sc.nextDouble();
        for(i=1;i<=n;i++)
        {
            a=(x*b)/y;
            s=s+a;
            b=b+2;
           x=x+10;
            y=y+2;
            
            }
            
            System.out.println(s);
        
        
    }
}