import java.util.Scanner;
public class aaray1
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        int a[]= new int[20];
        int i,count=0,count1=0;
        for (i=0;i<=19;i++)
        {
        System.out.println("enter a number");
        a[i]=sc.nextInt();
        if (a[i]%2==0)
        {
            count++;
        }
        else
        {
            count1++;
        }
    }
    System.out.println("the number of even numbers are "+count);
    System.out.println("the number of odd numbers are "+count1);
}
}