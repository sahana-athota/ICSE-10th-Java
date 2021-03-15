import java.util.Scanner;
public class str6
{
    public static void main(String args[])
    {
        Scanner sc= new Scanner(System.in);
        System.out.println("enter a sentence");
        String a= sc.nextLine();
        int count=0;
        for(int i=0;i<=(a.length()-1);i++)
        {
            char b=a.charAt(i);
            if(b==' ')
            count++;
        }
        System.out.println("the number of words you have entered are "+(count+1));
    }
}