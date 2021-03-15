import java.util.Scanner;
public class functio7
{
    /*Define a  class perfect with the following functions: 
    Int  sumOfFactors(int n)  -   returns the sum of all the factors of n except itself.
    Boolean isPerfect(int n)   -    Returns true if n is perfect else false. 
    Void display( int lim)      -    Prints out all perfect numbers less than limit.
    Each perfect  number should be printed on a single line along with its factors. 
    Eg: The perfect numbers below ( 10 )  will be    6  =  (  1, 2, 3 )*/
    int count=0;
    public static void main(String args[])
    {
        Scanner sc= new Scanner(System.in);
        functio7 obj= new functio7();
        System.out.println("enter a number"); 
        int n=sc.nextInt();
        int c=0;
        obj.diisplay(n,c);
    }
    int sumOffFactors(int c,int s)
    {
        
    
        for(int i=1;i<c;i++)
        {
            if(c%i==0)
            {
                s=i+s;
            }
        }
        
    
     return s;
}
    boolean issPerfect(int c,int s)
    {
        functio7 obj= new functio7();
        int a=obj.sumOffFactors(c,s);
        if(c==a)
        return true;
        else
        return false;
    }
    void diisplay(int n,int c)
    {
        int s=0;
        functio7 objj= new functio7();
        for( c=1;c<=n;c++)
        {
            boolean b=objj.issPerfect(c,s);
            if(b==true)
            {
                System.out.println("\n the perfect numbers below "+n+" are "+c);
                
                for(int i=1;i<c;i++)
                {
                    if(c%i==0)
                    {
                        System.out.print(i+" ");
                    }
                }
                
            }
        }
    }
}