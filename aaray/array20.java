import java.util.Scanner;
public class aaray20
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        int a[]=new int[10];
        int i,count=0;
        for(i=0;i<=9;i++)
        {
            System.out.println("enter a number");
            a[i]=sc.nextInt();
            if(i%2!=0)
            {
                if(a[i]%2==0)
                {
                    count++;
                }
            }
        }
        System.out.println(count);
    }
}