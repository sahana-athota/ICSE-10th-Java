import java.util.Scanner;
public class first_and_last
{
    public static void main (String args[])
    {
        Scanner sc = new Scanner (System.in);
        int a[] = new int [10];
        for (int i =0;i<=9;i++)
        {
            System.out.println("enter a number");
            a[i]= sc.nextInt();
        }
        System.out.println("the first number "+a[0]);
        System.out.println("the last number "+a[9]);
    }
}