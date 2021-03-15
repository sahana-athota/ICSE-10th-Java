import java.util.Scanner;
public class aaray6
{
    public static void main (String args[])
    {
        Scanner sc = new Scanner(System.in);
        int a[]= new int[10];
        int i,x=0,pro,n=0,pro1=1;
        for (i=0;i<=9;i++)
        {
            System.out.println("enter a number");
            a[i]=sc.nextInt();
        }
        for(i=0;i<=3;i++)
        {
            x=x+2;
            pro=a[n]*a[x];
            pro1=pro*pro1;
            System.out.println(pro);
            a[n]=a[x];
        }
        System.out.println(pro1);
    }
}