import java.util.Scanner;
public class alle
{ /*ABCDE
    ABCD
    ABC
    AB
    A
    */
    public static void main(String args[])
    {
        int i,j;
        for(i=1;i<=5;i++)
        {
            char x='A';
            int b=(int)x;
            for(j=5;j>=i;j--)
            {
                x=(char)b;
                System.out.print(x);
                b++;
            }
            System.out.println("");
        }
        
    }
}