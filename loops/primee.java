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
        System.out.println("enter second number");
        int b=sc.nextInt();
        for(int e=a;e<=b;e++)
        {
            count=0;
            for(int f=1;f<=b;f++)
            {
                if(e%f==0)
                {
                    count++;
                }
            }
            if(count==2)
            System.out.println("prime no. b/w entered number: "+e);
        }
    }
}