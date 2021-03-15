//Display the reverse of each word of a sentence Input-> who are you output ->ohw era uoy 
import java.util.Scanner;
public class str25
{ 
     public static void main(String args[])
    {
        Scanner sc= new Scanner(System.in);
        System.out.println("enter a string");
        String a= sc.nextLine();
        a=a+" ";
        int count=0;
        String temp="";
        for(int i=0;i<=(a.length()-1);i++)
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