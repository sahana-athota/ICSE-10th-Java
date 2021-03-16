import java.util.Scanner;
public class aaray25
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        String a[]={"error","january","february","march","april","may","june","july","august","september","october","november","december"};
        int i;
        String c,e="";
        System.out.println("enter date");
        int b=sc.nextInt();
        System.out.println("enter month");
        c=sc.nextLine();
        c=sc.nextLine();
        System.out.println("enter year");
        int d =sc.nextInt();
        for(i=0;i<=12;i++)
        {
            if(a[i].equals(c))
            {
                if(i==12)
                {
                    d=d+1;
                    e=a[1];
                    break;
                }
                else
                {
                   e=a[i+1];
                   break;
                }
            }
        }
        
        System.out.println("the new date with the next month is "+b+" "+e+","+d);
    }
}