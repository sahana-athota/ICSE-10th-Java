import java.util.Scanner;
public class aaray27
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        int a[]=new int[10];
        int e[]=new int[10];
        int o[]=new int[10];
        int i,k=0,j=0;
        for(i=0;i<=9;i++)
        {
            System.out.println("enter a number");
            a[i]=sc.nextInt();
        }
        for(i=0;i<=9;i++)
        {
            if(a[i]%2==0)
            {
                e[j]=a[i];
                j++;
            }
            else
            {
                o[k]=a[i];
                System.out.println(o[k]);
                k++;
            }
        }
    }
}
        