import java.util.Scanner;
public class aaray26
{
    public static void main(String args[])
    {
        Scanner sc= new Scanner(System.in);
        String a[]= {"0","I","II","III","IV","V","VI","VII","VIII","IX","X"};
        String rom="";
        System.out.println("enter a number");
        int b=sc.nextInt();
        if(b/10!=0)
        {
            rom=a[10]+a[b/10]+a[b%10];
            System.out.println(rom);
        }
        else
        {
            System.out.println(a[b]);
        }
    }
}
            
            