import java.util.Scanner;
public class alle
{ //S =1+4+9+16+25+36...225
    public static void main(String args[])
    {
        Scanner sc= new Scanner(System.in);
        int i;
        double a=0,s=0;
        
        for(i=0;i<=15;i++)
        {
            a=Math.pow(i,2);
            s=s+a;
          
            }
            
            System.out.println(s);
        
        
    }
}