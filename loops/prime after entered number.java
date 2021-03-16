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
        int b=1+a;
        for(int e=b;a<e;e++)
        {
            count=0;
            for(int f=1;f<=e;f++)
            {
                if(e%f==0)
                {
                    count++;
                }
            }
            if(count==2)
            {
            System.out.println("prime no. after entered number: "+e);
            break;
        }
        }
    }
}