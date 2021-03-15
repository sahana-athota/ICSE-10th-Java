import java.util.Scanner;
public class str1
{
    public static void main(String args[])
    {
        Scanner sc= new Scanner(System.in);
        System.out.println("enter string");
        String a= sc.next();
        int l=a.length();
        System.out.println("the first letter is:"+a.charAt(0)+" \nlast letter is "+a.charAt(l-1));
    }
}