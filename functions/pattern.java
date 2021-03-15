import java.util.Scanner;
public class function6
{ /*Overload a function pattern() to perform the following tasks 
    void pattern (char lim) – generates the following pattern up to given character limit.
    A 
    B C 
    D E F
    G H I .... lim  
    void pattern (int n) – generates the following pattern up to n no. of lines. 
    1 
    2 3
    4 5 6  ....  Upto n no. of lines             
    void pattern ( ) – generates the following pattern    
    A * 
    B *C *  
    D *E *F *    
    G *H *I *J *   
    K *L *M *N *O * */
    public static void main(String args[])
    {
        Scanner sc= new Scanner(System.in);
        function6 obj= new function6();
        System.out.println("choose  1.letters  2.numbers  3.patterns");
        int a=sc.nextInt();
        switch(a)
        {
            case 1:
            System.out.println("enter the end letter");
            char x=sc.next().charAt(0);
            obj.pattern(x);
            break;
            case 2:
            System.out.println("enter the number of lines");
            int n=sc.nextInt();
            obj.pattern(n);
            break;
            case 3:
            obj.pattern();
            break;
        }
    }
    void pattern(char x)
    { 
        int c=65;
        for(int i=1;i<=7;i++)
        {
            for(int j=1;j<=i;j++)
            {
                char b= (char)c;
                if(b==x)
                {
                    System.exit(0);
                }
                System.out.print(b+" ");
                c++;
            }
            System.out.println("");
        }
    }
    void pattern(int n)
    {
        int m=1;
        for(int k=1;k<=n;k++)
        {
            for(int l=1;l<=k;l++)
            {
                System.out.print(m+" ");
                m++;
            }
            System.out.println("");
        }
    }
    void pattern()
    {
        int z=65;
        for(int I=1;I<=5;I++)
        {
            for(int J=1;J<=I;J++)
            {
                char y= (char)z;
                System.out.print(y+"*  ");
                z++;
            }
            System.out.println("");
        }
    }
}