// Display the length of each word of a sentence 
import java.util.Scanner;
public class str23
{ 
     public static void main(String args[])
    {
        Scanner sc= new Scanner(System.in);
        System.out.println("enter a string");
        String a= sc.nextLine();
        a=a+" ";
        String temp="";
        int count=0;
        for(int i=0;i<=(a.length()-1);i++)
        {
            char b=a.charAt(i);
            if(b!=' ')
            {
                temp=temp+b;
                
                count++;
            }
            if(b==' ')
            {
                System.out.println(temp+" :"+count);
               temp="";
            count=0;
            }
            
        }
    }
}