import java.util.Scanner;
public class str3
{
    public static void main(String args[])
    {
        Scanner sc= new Scanner(System.in);
        System.out.println("enter the string");
        String a=sc.next();
        for(int i=0;i<=(a.length()-1);i++)
        {
            char b=a.charAt(i);
            if(b>='A' && b<='Z')
            {
                System.out.println(b);
            }
        }
    }
}