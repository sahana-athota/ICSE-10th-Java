//Reverse the case of each character of a String i.e. convert lower case alphabets to uppercase and vice versa 
import java.util.Scanner;
public class str21
{ 
     public static void main(String args[])
    {
        Scanner sc= new Scanner(System.in);
        System.out.println("enter a string");
        String a= sc.next();
        int count=0,count1=0;
        String c="";
        for(int i=0;i<=(a.length()-1);i++)
        {
            char b=a.charAt(i);
            int ab=(int)b;
            if(b>='A' && b<='Z')
            {
               ab=ab+32;
            }
            if(b>='a' && b<='z')
            {
                ab=ab-32;
            }
            b=(char)ab;
            c=c+b;
        }
        System.out.println(c);
    }
}