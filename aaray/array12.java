import java.util.Scanner;
public class aaray12
{
    public static void main (String args[])
    {
        Scanner sc = new Scanner(System.in);
        int a[]= new int[10];
        int i,max=0,min=1000;
        for(i=0;i<=9;i++)
        {
            System.out.println("enter a number");
            a[i]=sc.nextInt();
            if(a[i]>max)
            {
                max=a[i];
            }
            if(a[i]<min)
            {
                min=a[i];
            }
        }
        System.out.println("the max number is "+max);
        System.out.println("the min number is "+min);
    }
}