import java.util.Scanner;
public class function4
{
    /*Give below options and implement the same using functions. 
    Call the functions from switch-case construct based on the input provided by the user.
    Options are 1->Add 2 numbers 2->Difference of the two 3->multiply them  */
    public static void main(String args[])
    {
        Scanner sc= new Scanner(System.in);
        function4 obj= new function4();
        System.out.println("choose : 1. ADD  2. DIFFERENCE  3.MULTIPLY");
        int a=sc.nextInt();
        switch(a)
        {
            case 1:
            obj.add();
            break;
            case 2:
            obj.subtract();
            break;
            case 3:
            obj.multiply();
            break;
            default:
            System.out.println("enter correct number");
        }
    }
    void add()
    {
        Scanner sc= new Scanner(System.in);
        int x,y,s;
        System.out.println("enter 2 numbers to add");
        x=sc.nextInt();
        y=sc.nextInt();
        s=x+y;
        System.out.println("sum of two numbers: "+s);
    }
    void subtract()
    {
        Scanner sc= new Scanner(System.in);
        int x,y,s;
        System.out.println("enter 2 numbers");
        x=sc.nextInt();
        y=sc.nextInt();
        if(x>y)
        {
            s=x-y;
        }
        else
        {
            s=y-x;
        }
        System.out.println("difference between two numbers are "+s);
    }
    void multiply()
    {
        Scanner sc= new Scanner(System.in);
        int x,y,s;
        System.out.println("enter 2 numbers to add");
        x=sc.nextInt();
        y=sc.nextInt();
        s=x*y;
        System.out.println("product of two numbers: "+s);
    }
}