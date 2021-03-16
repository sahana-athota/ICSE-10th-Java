import java.util.Scanner;
public class idk
{
    public static void main (String args[])
    {
        Scanner sc = new Scanner(System.in);
        int sum=0,x=0,y=0,count=0;
        System.out.println("enter number to start");
        x=sc.nextInt();
         System.out.println("enter number to end");
         y=sc.nextInt();
        for(int c=x;c<=y;c++)
        {
            if(c%2==0)
            {
                sum=sum+c;
                count++;
            }
        }
        System.out.println(sum+" "+count);
    }
}