import java.util.Scanner;
public class alle
{ //S =1+2+3+5+8+13..n terms
    public static void main(String args[])
    {
        Scanner sc= new Scanner(System.in);
        int a,x=0,y=1,s=0,n,i;
        System.out.println("enter number");
        n=sc.nextInt();
        
        for(i=1;i<=n;i++)
        {
            a=x+y;
            s=s+a;
            x=y;
            y=a;
            }
            
            System.out.println(s);
        
    }
}