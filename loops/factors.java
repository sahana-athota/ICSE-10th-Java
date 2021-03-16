import java.util.Scanner;
public class idk
{
    public static void main (String args[])
    {
        Scanner sc = new Scanner(System.in);
        int sum=0;
        System.out.println("enter number");
        int a=sc.nextInt();
        for(int c=1;c<=100;c++)
        {
            if(a%c==0)
            System.out.println(c);
        }
        
    }
}