import java.util.Scanner;
public class function1
{
    public void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        function1 obj= new function1();
        System.out.println("enter a number");
        int x=sc.nextInt();
        int y=sc.nextInt();
        greatest(x,y);
    }
    public void greatest(int x,int y)
    {
        int g= Math.max(x,y);
        System.out.println(g);
    }
}