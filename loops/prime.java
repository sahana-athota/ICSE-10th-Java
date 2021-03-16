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
        for(int e=1;e<=a;e++)
        {
            if(a%e==0)
            {
                count++;
            }
        }
        if(count==2)
        System.out.println("prime");
        else
        System.out.println("not prime");
    }
}
