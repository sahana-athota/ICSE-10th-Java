import java.util.Scanner;
public class aaray22
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        int a[]=new int[10];
        int i,count=0,count1=0,j;
        for(i=0;i<=9;i++)
        {
            System.out.println("enter a number");
            a[i]=sc.nextInt();
        }
        for(i=0;i<=9;i++)
        {
            for(j=1;j<=a[i];j++)
            {
                if(a[i]%j==0)
                {
                    count++;
                    
                }
                else
                {
                }
            }
            if(count==2)
            {
                count1++;
            }
            count=0;
        }
        System.out.println("the number of prime numbers are : "+count1);
        }
    }