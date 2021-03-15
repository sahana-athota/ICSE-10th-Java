import java.util.Scanner;
public class function3
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        function3 obj= new function3();
        System.out.println("enter 2 number");
        int x=sc.nextInt();
        int y=sc.nextInt();
        double z= obj.power(x,y);
        System.out.println(z);
    }
    double power(int x,int y)
    {
        int n=1;
        for(int i=1;i<=y;i++)
        {
            n=n*x;
        }
        return n;
    }
}
