import java.util.Scanner;
public class str9
{ //Display the count of consecutive alphabets in a String 
    public static void main(String args[])
    {
        Scanner sc= new Scanner(System.in);
        System.out.println("enter a sentence");
        String a=sc.next();
        int count=0;
        for(int i=0;i<=(a.length()-2);i++) 
        {
            char b=a.charAt(i);
            char c=a.charAt(i+1);
            if(c-b==1)
            {
                count++;
            }
        }
        System.out.println(count);
    }
}