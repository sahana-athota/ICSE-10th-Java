import java.util.Scanner;
public class alle
{
    public static void main(String args[])
    {
        Scanner sc= new Scanner(System.in);
        int sum=0;
        int count=0;
        for(int a=1;a<=5;a++)
        {
            System.out.println("Enter marks");
            int m=sc.nextInt();
            if(m>sum)
            sum=m;
        }
        System.out.println("highest marks "+sum);
    }
}