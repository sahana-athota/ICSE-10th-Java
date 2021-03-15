import java.util.Scanner;
public class str12
{
    public static void main(String args[])
    {
        Scanner sc= new Scanner(System.in);
        System.out.println("enter a string");
        String a=sc.next();
        System.out.println("specify position1");
        int b=sc.nextInt();
        System.out.println("specify position2");
        int c=sc.nextInt();
        char d=a.charAt(b);
        char e=a.charAt(c);
        String f="";
        for(int i=0;i<=(a.length()-1);i++)
        {
            if(i==b)
            f=f+e;
            else if(i==c)
            f=f+d;
            else
            f=f+a.charAt(i);
        }
        System.out.println(f);
    }
}
