import java.util.Scanner;
public class aaray17
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        int a[]= new int[20];
        int i,max=0,min=1000;
        for(i=0;i<=19;i++)
        {
            System.out.println("enter a number");
            a[i]=sc.nextInt();
            if(a[i]%2==0)
            {
                if(a[i]>max)
                {
                    max=a[i];
                }
            }
            else
            {
                if(a[i]<min)
                {
                    min=a[i];
                }
            }
        }
        System.out.println("largest even number is "+max);
        System.out.println("the smallest odd number is "+min);
    }
}