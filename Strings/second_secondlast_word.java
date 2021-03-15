//Display the second and second last word of a sentence
import java.util.Scanner;
public class str24
{ 
     public static void main(String args[])
    {
        Scanner sc= new Scanner(System.in);
        System.out.println("enter a string");
        String a= sc.nextLine();
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
                if(count==2)
                {
                    System.out.println(temp);
                    break;
                }
                temp="";
                count++;
            }
            
        }
        count=0;
        for(int i=0;i<=(a.length()-1);i++)
        {
            char b=a.charAt(i);
            if(b!=' ')
            {
                temp=temp+b;
            }
            if(b==' ')
            {
                if(count==2)
                {
                    System.out.println(temp);
                    break;
                }
                temp="";
                count++;
            }
            
        }
    }
}