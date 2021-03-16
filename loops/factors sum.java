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
                sum=sum+e;
                System.out.println("factors"+e);
            }
        }
        System.out.println("sum: "+sum+" count:"+count);
    }
}