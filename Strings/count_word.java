//Find the count of a particular word input by user in a sentence
import java.util.Scanner;
public class str22
{ 
     public static void main(String args[])
    {
        Scanner sc= new Scanner(System.in);
        System.out.println("enter a string");
        String a= sc.nextLine();
        a=a+" ";
        System.out.println("enter a word");
        String c=sc.nextLine();
        String temp="";
        int count=0;
        for(int i=0;i<=(a.length()-1);i++)
        {
            char b=a.charAt(i);
            if(b!=' ')
            {
                temp=temp+b;
            }
            if(b==' ')
            {
                System.out.println(temp);
                if(temp.equals(c))
                count++;
            }
            temp="";
        }
        System.out.println(""+count);
    }
}