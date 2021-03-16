import java.util.Scanner;
public class alle
{ /*1
    23
    456
    78910
    1112131415
    */
    public static void main(String args[])
    {
        int i,j,x=1;
        for(i=1;i<=5;i++)
        {
            for(j=1;j<=i;j++)
            {
                System.out.print(x);
                x++;
            }
            System.out.println("");
        }
        
    }
}