import java.util.Scanner;
public class aaray4
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner (System.in);
        int a[] = new int [10];
        int x=9,b,i=0;
        for (i=0;i<=9;i++)
        {
            System.out.println("enter a number");
            a[i]= sc.nextInt();
        }
        for (i=0;i<=5;i++)
        {
            b=a[i];
            a[i]=a[x];
            a[x]=b;
            x--;
        }
        for (i=0;i<=9;i++)
        {
            System.out.println(a[i]);
        }
    }
}