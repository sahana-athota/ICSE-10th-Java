import java.util.Scanner;
public class alle
{ //S =1+12+123+1234...n
    public static void main(String args[])
    {
        Scanner sc= new Scanner(System.in);
        int a=0,s=0,n,i,x=1;
        System.out.println("enter a number");
        n=sc.nextInt();
        for(i=1;i<=n;i++)
        {
           a=x+a;
           s=s+a;
           a=a*10;
           x++;
            }
            
            System.out.println(s);
        
        
    }
}