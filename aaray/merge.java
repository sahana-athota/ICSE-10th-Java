import java.util.Scanner;
public class aaray19
{
    public static void main(String args[]) // use 2 different loops in exams and stuff
    {
        Scanner sc = new Scanner(System.in);
        int a[]=new int[10];
        int b[]=new int[5];
        int c[]=new int[15];
        int i,j=10;
        for(i=0;i<=9;i++)
        {
            System.out.println("enter a number");
            a[i]=sc.nextInt();
            c[i]=a[i];
        }
        for(i=0;i<=4;i++)
        {
            System.out.println("enter a number");
            b[i]=sc.nextInt();
            c[j]=b[i];
            j++;
        }
        for(i=0;i<=14;i++)
        {
           System.out.println("the merged array : "+c[i]);
        }
    }
}