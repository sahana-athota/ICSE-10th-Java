import java.util.Scanner;
public class str13
{
    public static void main(String args[])
    {
        Scanner sc= new Scanner(System.in);
        System.out.println("enter a string");
        String a=sc.next();
        System.out.println("enter a string");
        String b=sc.next();
        int count=0;
        if(a.length()==b.length())
        {
            for(int i=0;i<=(a.length()-1);i++)
            {
                char c=a.charAt(i);
                char d=b.charAt(i);
                if(d==c)
                count++;
            }
            if(count==a.length())
            System.out.println("they are the same");
            else
            System.out.println("they arent the same");
        }
        else
        System.out.println("the arent the same");
        }
    }