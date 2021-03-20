import java.util.Scanner;
public class alle
{ //S =1/2! +3/4! +5/6!...n
    public static void main(String args[])
    {
        Scanner sc= new Scanner(System.in);
        int z=1,y=2,x=1,n,i;
        double s=0,a=1;
        System.out.println("enter a number");
        n=sc.nextInt();
        for(i=1;i<=n;i++)
        {
            a=x*a*y;
            s=s+(z/a);
            z=z+2;
            x=y+1;
            y=x+1;
            
            }
            
            System.out.println(s);
        
        
    }
}