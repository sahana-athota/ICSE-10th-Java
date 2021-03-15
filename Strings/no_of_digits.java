import java.util.Scanner;
public class str7
{
    public static void main(String args[])
    {
        Scanner sc= new Scanner(System.in);
        System.out.println("enter a sentnce");
        String a=sc.nextLine();
        int count=0,count1=0;
        for(int i=0;i<=(a.length()-1);i++)
        {
            int b=a.charAt(i);
            if((b>=65 && b<=90)||(b>=97 && b<=122))
            {
            }
            else
            {
                if(b>=48 && b<=57)
                count++;
                else
                count1++;
            }
        }
        System.out.println("the number of digits are "+count);
        System.out.println("the number of special characters are "+count1);
    }
}