import java.util.Scanner;
public class reverse_array
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        int a[]=new int[11];
        int i,j=10,temp=0;
        for(i=0;i<=10;i++)
        {
            System.out.println("enter a number");
            a[i]=sc.nextInt();
        }
        for(i=0;i<=4;i++)
        {
            temp=a[i];
            a[i]=a[j];
            a[j]=temp;
            j--;
        }
        for(i=0;i<=10;i++)
        {
            System.out.println(a[i]);
        }
    }
}