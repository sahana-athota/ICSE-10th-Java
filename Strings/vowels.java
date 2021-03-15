import java.util.Scanner;
public class str4
{
    public static void main(String args[])
    {
        Scanner sc= new Scanner(System.in);
        System.out.println("enter a string");
        String a= sc.next();
        int count=0;
        for(int i=0;i<=(a.length()-1);i++)
        {
            char b= a.charAt(i);
            if(b=='a' || b=='A' || b=='E' ||b=='e' ||b=='I' ||b=='i' ||b=='O' ||b=='U' ||b=='o' ||b=='u')
            {
                count++;
            }
        }
        System.out.println(count);
    }
}