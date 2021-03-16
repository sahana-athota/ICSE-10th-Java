import java.util.Scanner;
public class alle
{
    public static void main(String args[])
    {
        Scanner sc= new Scanner(System.in);
        int sum=0;
        int count=0;
        System.out.println("Enter a number");
        int a=sc.nextInt();
        int e=0;
        for(e=2;e<a;e++)
        {
            if(a%e==0)
            {
                System.out.println("smallest factor other than 1 "+e);
                break;
            }
        }
        int b=a/e;
        System.out.println("biggest factor "+b);
    }
}
