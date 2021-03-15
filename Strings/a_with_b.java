import java.util.Scanner;
public class str19
{
    public static void main(String args[])
    {
        Scanner sc= new Scanner(System.in);
        System.out.println("enter a string");
        String a=sc.next();
        String c="";
        for(int i=0;i<=(a.length()-1);i++)
        {
            char b=a.charAt(i);
            if(b=='a')
            c=c+'b';
            else if(b=='A')
            c=c+'B';
            else 
            c=c+b;
        }
        System.out.println(c);
    }
}