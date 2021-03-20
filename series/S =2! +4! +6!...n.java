import java.util.Scanner;
public class alle
{ //S =2! +4! +6!...n
    public static void main(String args[])
    {
        Scanner sc= new Scanner(System.in);
        int a=1,y=2,x=1,s=0,n,i;
        System.out.println("enter a number");
        n=sc.nextInt();
        for(i=1;i<=n;i++)
        {
            a=x*a*y;
            s=s+a;
            x=y+1;
            y=x+1;
            
            }
            
            System.out.println(s);
        
        
    }
}