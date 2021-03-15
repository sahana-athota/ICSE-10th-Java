import java.util.Scanner;
public class aaray28
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        int a[]= new int[10];
        int b[]=new int[10];
        int m[]=new int[20];
        int i,j=10;
        for(i=0;i<=9;i++)
        {
            System.out.println("enter a number");
            a[i]=sc.nextInt();
            m[i]=a[i];
        }
        for(i=0;i<=9;i++)
        {
            System.out.println("enter a number");
            b[i]=sc.nextInt();
            m[j]=b[i];
            j++;
        }
        for(i=0;i<=19;i++)
        { 
            System.out.println(m[i]);
        }
    }
}