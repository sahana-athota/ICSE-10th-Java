import java.util.Scanner;
public class aaray13
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        int a[]= new int[10];
        int i,b,max=0;
        for(i=0;i<=9;i++)
        {
            System.out.println("enter a number");
            a[i]=sc.nextInt();
        }
        System.out.println("specify th location");
        b=sc.nextInt();
        for(i=b;i<=9;i++)
        {
            if(a[i]>max)
            {
                max=a[i];
            }
        }
        System.out.println("the maximum number after"+b+"is "+max);
    }
}