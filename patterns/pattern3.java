import java.util.Scanner;
public class alle
{ /* 5
     54
     543
     5432
     54321 */
    public static void main(String args[])
    {
        int i,j,x;
        for(i=1;i<=5;i++)
        {
            x=5;
            for(j=1;j<=i;j++)
            {
                System.out.print(x);
                x--;
            }
            System.out.println("");
        }
        
    }
}