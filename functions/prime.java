import java.util.Scanner;
public class function2
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        function2 obj = new function2();
        System.out.println("enter a number");
        int x=sc.nextInt();
        Boolean z= obj.Prime(x);
        if(z==true)
        {
            System.out.println("it is prime");
        }
        else
        {
            System.out.println("it is not prime");
        }
    }
    public boolean Prime(int x)
    {
        int count=0;
        for( int i=1;i<=x;i++)
        {
            if(x%i==0)
            {
                count++;
            }
        }
        if(count==2)
        {
            return true;
        }
        else
        {
            return false;
        }
    }
}
                