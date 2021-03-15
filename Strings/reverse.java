import java.util.Scanner;
public class str2
{
    public static void main(String args[])
    {
        Scanner sc= new Scanner(System.in);
        System.out.println("enter the string");
        String a= sc.next();
        int l=a.length();
        String reverse="";
        for(int i=(l-1);i>=0;i--)
        {
           reverse= reverse+a.charAt(i);
        }
        System.out.println("reversed string is "+reverse);
    }
}