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
        for(e=1;e<=a;e++)
        {
            if(a%e==0)
            {
                sum=sum+e;
            }
        }
        if(sum==a)
        System.out.println("it is perfect ");
        else
        System.out.println("it is not perfect");
    }
}