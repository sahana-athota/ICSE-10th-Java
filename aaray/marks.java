import java.util.Scanner;
public class aaray9
{
    public static void main (String args[])
    {
        Scanner sc = new Scanner (System.in);
        int a[]= new int [6];
        int sum=0,min=1000;
        for(int i = 0;i<=5;i++)
        {
            System.out.println("enter a number");
            a[i]=sc.nextInt();
            if(a[i]<min)
            {
                min=a[i];
            }
            sum =a[i]+sum;
        }
        sum=sum-min;
        System.out.println("total of best five subjects is "+sum);
    }
}