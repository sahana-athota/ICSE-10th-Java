import java.util.Scanner;
public class aarayin_reverse_order
{
    public static void main (String args[])
    {
        Scanner sc = new Scanner (System.in);
        int x[] = new int [10];
        int i;
        
        for (i=9;i>=0;i--)
        {
           System.out.println("enter a number");
           x[i]= sc.nextInt();
        }
        for (i=0;i<=9;i++)
        {
           System.out.println("the reverse order is "+x[i]);
        }
    }
}