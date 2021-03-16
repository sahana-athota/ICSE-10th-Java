import java.util.Scanner;
public class aaray23
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        String a[]={"error","january has 31 days ","february has 28 days","march has 31 days","april has 30 days","may has 31 days","june has 30 days","july has 31 days","august has 31 days","septermber has 30 days","october has 31 days","november has 31 days","december has 31 days"};
        System.out.println("enter a number between 1-12");
        int b=sc.nextInt();
        System.out.println(a[b]);
    }
}