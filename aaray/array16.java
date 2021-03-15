import java.util.Scanner;
public class aaray16
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        int a[]= new int[20];
        int i,sum=0,sum1=0;
        for(i=0;i<=9;i++)
        {
            System.out.println("enter a number");
            a[i]=sc.nextInt();
            sum=a[i]+sum;
        }
        for(i=10;i<=19;i++)
        {
            System.out.println("enter a number");
            a[i]=sc.nextInt();
            sum1=a[i]+sum1;
        }
        if(sum>sum1)
        {
            System.out.println(sum+" is the greater sum");
        }
        else if(sum1>sum)
        {
            System.out.println(sum1+" is the greater sum");
        }
        else
        {
            System.out.println("they are equal");
        }
    }
}