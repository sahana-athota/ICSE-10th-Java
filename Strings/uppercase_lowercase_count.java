import java.util.Scanner;
public class str5
{
    public static void main(String args[])
    {
        Scanner sc= new Scanner(System.in);
        System.out.println("enter a string");
        String a= sc.next();
        int count=0,count1=0;
        for(int i=0;i<=(a.length()-1);i++)
        {
            char b=a.charAt(i);
            if(b>='A' && b<='Z')
            {
                count++;
            }
            if(b>='a' && b<='z')
            {
                count1++;
            }
        }
        System.out.println("small: "+count1+" big: "+count);
    }
}