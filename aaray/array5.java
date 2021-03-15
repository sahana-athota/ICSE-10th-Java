import java.util.Scanner;
public class aaray5
{
    public static void main (String args[])
    {
        Scanner sc = new Scanner (System.in);
        int a[]= new int[10];
        int i=0;
        for (i=0;i<=9;i++)
        {
            System.out.println("enter a number");
            a[i]= sc.nextInt();
            
        }
        for (i=0;i<=9;i++)
        {
            if (a[i]%2==0 && a[i]%6==0)
            {
                System.out.println("the even multiples of six are "+a[i]);
            }
            else
            {
            }
        }
    }
}
     