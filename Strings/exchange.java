import java.util.Scanner;
public class str17
{
    public static void main(String args[])
    {
        Scanner sc= new Scanner(System.in);
        System.out.println("enter a string");
        String a=sc.next();
        System.out.println("specify the 2 positions");
        int x=sc.nextInt();
        int y=sc.nextInt();
        String c="";
        for(int i=x;i<=y;i++)
        {
            char b=a.charAt(i);
            c=c+b;
        }
        System.out.println(""+c);
    }
}