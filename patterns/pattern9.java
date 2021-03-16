import java.util.Scanner;
public class alle
{ /*22222
    4444
    666
    88
    10
    */
    public static void main(String args[])
    {
        int i,j,x=2;
        for(i=1;i<=5;i++)
        {
            for(j=5;j>=i;j--)
            {
                System.out.print(x);
            }
            x=x+2;
            System.out.println("");
        }
        
    }
}