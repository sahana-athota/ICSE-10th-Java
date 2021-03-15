import java.util.Scanner;
public class aaray21
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        int a[]=new int[10];
        int i;
        for(i=0;i<=9;i++)
        {
            System.out.println("enter a number");
            a[i]=sc.nextInt();
            int x;
            if(i==9)
            {
                x=a[i];
                a[i]=a[0];
                a[0]=x;
            }
        }
        for(i=0;i<=9;i++)
        {
            System.out.println("the rearranged array is "+a[i]);
        }
    }
}
                