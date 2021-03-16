import java.util.Scanner;
public class aaray18
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        int a[]=new int[10];
        int b[]=new int[5];
        int c[]=new int[5];
        int j=0,i;
        int k=0;
        for(i=0;i<=9;i++)
        {
            
            System.out.println("enter a number");
            a[i]=sc.nextInt();
            if(i<=4)
            {
                b[j]=a[i];
                j++;
            }
            else
            {
                c[k]=a[i];
                k++;
            }
        }
        for(i=0;i<=4;i++)
        {
            System.out.println("b s first 5 elements are : "+b[i]);
        }
        for(i=0;i<=4;i++)
        {
            System.out.println("c s last 5 elements are : "+c[i]);
        }
    }
}