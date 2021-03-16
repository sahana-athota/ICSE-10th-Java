import java.util.Scanner;
public class aaray14
{
    public static void main (String args[])
    {
        Scanner sc = new Scanner(System.in);
        int a[]= new int[20];
        int i,y=1,x=0,b;
        for(i=0;i<=19;i++)
        {
            a[i]=y;
            b=x+y;
            x=y;
            y=b;
            System.out.println(a[i]);
        }
    }
} 