import java.util.Scanner;
public class aaray24
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        String a[]= {"zero","one","two","three","four","five","six","seven","eight","nine"};
        
        System.out.println("enter a number between 0-9");
        int b=sc.nextInt();
        System.out.println(a[b]);
    }
}