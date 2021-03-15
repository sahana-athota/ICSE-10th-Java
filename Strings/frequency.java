import java.util.Scanner;
public class str14
{
    public static void main(String args[])
    {
        Scanner sc= new Scanner(System.in);
        System.out.println("enter a string");
        String a=sc.next();
        System.out.println("enter a character");
        char b=sc.next().charAt(0);
        int count=0;
        for(int i=0;i<=(a.length()-1);i++)
        {
            char c=a.charAt(i);
            if(c==b)
            count++;
        }
        System.out.println("frequency is "+count);
    }
}