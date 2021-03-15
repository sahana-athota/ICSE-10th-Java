import java.util.Scanner;
public class aaray15
{
    public static void main (String args[])
    {
        Scanner sc = new Scanner(System.in);
        String a[]= new String[10];
        int i,count=0;
        char b;
        for(i=0;i<=9;i++)
        {
            System.out.println("enter the names");
            a[i]=sc.nextLine();
            
            b=a[i].charAt(0);
            if('a'==b || 'A'==b)
            {
                count++;
            }
        }
        System.out.println(count);
    }
}