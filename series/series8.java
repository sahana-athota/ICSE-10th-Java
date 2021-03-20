import java.util.Scanner;
public class alle
{ //S =1+2+4+8+16...1024
    public static void main(String args[])
    {
        Scanner sc= new Scanner(System.in);
       int i;
        double a=0,s=0;
        
        for(i=0;i<=10;i++)
        {
            a=Math.pow(2,i);
            s=s+a;
          
            }
            
            System.out.println(s);
        
    }
}