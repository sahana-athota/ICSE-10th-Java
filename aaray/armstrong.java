import java.util.Scanner;
public class aaray7
{
    public static void main (String args[])
    {
        Scanner sc = new Scanner (System.in);
        int a[]= new int[10];
        int b,rem,count=0,count1=0;
        double sum=0;
        for (int i = 0;i<=9;i++)
        {
            System.out.println("enter a number");
            a[i]=sc.nextInt();
            b=a[i];
            count=0;
            sum=0;
            while (b!=0)
            {
                rem=b%10;
                b=b/10;
                sum=sum+Math.pow(rem,3);
                System.out.println(sum);  
            }
            if(a[i]==sum)
                {
                    count1++;
                }
        }
        System.out.println("the number of armstrong numbers are "+count1);
    }
}
        