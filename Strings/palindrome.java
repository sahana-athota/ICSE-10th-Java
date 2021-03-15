import java.util.Scanner;
public class str16
{
    public static void main(String args[])
    {
        Scanner sc= new Scanner(System.in);
        System.out.println("enter a string");
        String a=sc.next();
        int c=0,b=0;
        String e="",f="";
        for(int i=(a.length()-1);i>=0;i--)
        {
            char d=a.charAt(i);
            e=e+d;
        }
        if(e.equals(a))
        System.out.println("it is palindrome");
        else
        System.out.println("it is not a palindrome");
    }
}