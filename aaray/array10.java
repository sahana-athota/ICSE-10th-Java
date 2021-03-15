import java.util.Scanner;
public class aaray10
{
    public static void main (String args[])
    {
        Scanner sc = new Scanner(System.in);
        int a[]= new int[10];
        int i,max=0,max1=0; 
        for(i=0;i<=9;i++)
        {
            System.out.println("enter a number");
            a[i]=sc.nextInt();
            if(a[i]>max)
            {
                max=a[i];
            }
        }
        for(i=0;i<=9;i++)
        {
            if(a[i]!=max)
            {
                if(a[i]>max1)
                {
                    max1=a[i];
                }
            }
        }
        System.out.println(max1);
     }
}
