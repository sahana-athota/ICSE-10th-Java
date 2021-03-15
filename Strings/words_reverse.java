//Display the words in reverse order as per e.g. Input ->Computer is fun Output ->fun is Computer 
import java.util.Scanner;
public class str26
{ 
     public static void main(String args[])
    {
        Scanner sc= new Scanner(System.in);
        System.out.println("enter a string");
        String a= sc.nextLine();
        a=" "+a;
        int count=0;
        String temp="";
        for(int i=(a.length()-1);i>=0;i--)
        {
            char b=a.charAt(i);
            if(b!=' ')
            {
                temp=b+temp;
            }
            if(b==' ')
            {
                System.out.print(temp+" ");
                temp="";
            }
        }
    }
}
