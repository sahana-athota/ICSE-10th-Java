import java.util.Scanner;
public class aaray11
{
    public static void main (String args[])
    {
        Scanner sc = new Scanner(System.in);
        int a[]= new int [10];
        int i;
        for(i=0;i<=9;i++)
        {
            System.out.println("enter a number");
            a[i]=sc.nextInt();
            if(a[i]%2==0)
            {
                a[i]= a[i]+2;
            }
            else
            {
                a[i]=a[i]+3;
            }
        }
        for(i=0;i<=9;i++)
        {
            System.out.println(a[i]);
        }
    }
}
        