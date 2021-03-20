import java.util.Scanner;
public class alle
{ //S =1+3+7+13+21...n terms
    public static void main(String args[])
    {
        Scanner sc= new Scanner(System.in);
        double a=0,x=0,y=1,s=0,n,i;
        System.out.println("enter number");
        n=sc.nextInt();
        for(i=1;i<=n;i++)
        {
            a=Math.pow(2,x) +a;
            s=s+a;
            x++;
            }
            
            System.out.println(s);
        
    }
}