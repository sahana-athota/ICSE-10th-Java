import java.util.Scanner;
public class function5
{ //Overload function Area to find area of square, rectangle or circle as per user’s choice 
    public static void main(String args[])
    {
        Scanner sc= new Scanner(System.in);
        function5 obj=new function5();
        System.out.println("choose: 1. area of square  2.area of rectangle  3.area of circle");
        int a=sc.nextInt();
        switch(a)
        {
            case 1:
            System.out.println("enter the side");
            int x=sc.nextInt();
            obj.area(x);
            break;
            case 2:
            System.out.println("enter length and breadth");
            int l=sc.nextInt();
            int b=sc.nextInt();
            obj.area(l,b);
            break;
            case 3:
            System.out.println("enter radius");
            double r=sc.nextDouble();
            obj.area(r);
            break;
        }
    }
    void area(int x)
    {
        int s= x*x;
        System.out.println("area of square is "+s);
    }
    void area(int l,int b)
    {
        int s=l*b;
        System.out.println("area of rectangle "+s);
    }
    void area(double r)
    {
        double s= 3.14*r*r;
        System.out.println("area of circle "+s);
    }
}