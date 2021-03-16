import java.util.Scanner;
public class aaray8
{
    public static void main (String args[])
    {
        Scanner sc = new Scanner (System.in);
        int a[]= new int [10];
        int max=0;
        for(int i=0;i<=9;i++)
        {
            System.out.println("enter a number");
            a[i]=sc.nextInt();
            if(a[i]>max)
            {
                max=a[i];
            }
        }
        System.out.println("the maximum number is "+max);
    }
}