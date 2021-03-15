import java.util.Scanner;
public class str8
{ //Change the case of vowels in a String from upper to lower and vice versa 
    public static void main(String args[])
    {
        Scanner sc= new Scanner(System.in);
        System.out.println("enter a string");
        String as= sc.next();
        String c="";
        int a=0;
        for(int i=0;i<=(as.length()-1);i++)
        {
            char b=as.charAt(i);
            a=(int)b;
            if( b=='A' || b=='E'  ||b=='I' ||b=='O' ||b=='U')
            {
                 a=b+32;
            }
            else if(b=='a'||b=='e'||b=='i'||b=='o' ||b=='u')
            {
                a= b-32;
            }
            b=(char)a;
            c= c+b;
        }
        System.out.println(""+c);
    }
} 