//Change the case of first alphabet of each word from upper to lower and vice versa 
import java.util.Scanner;
public class str27
{ 
     public static void main(String args[])
    {
        Scanner sc= new Scanner(System.in);
        System.out.println("enter a string");
        String a= sc.nextLine();
        a=a+" ";
        String temp="";
        int count=0;
        for(int i=0;i<=(a.length()-1);i++)
        {
            char b=a.charAt(i);
            if(b!=' ')
            {
                if(count==0)
                {
                    int ab=(int)b;
                    if(b>='A' && b<='Z')
                    {
                        ab=ab+32;
                    }
                    if(b>='a' && b<='z')
                    {
                        ab=ab-32;
                    }
                    b=(char)ab;
                }
                temp=temp+b;
                count++;
            }
            if(b==' ')
            {
                System.out.print(temp+" ");
                temp="";
                count=0;
            }
        }
    }
}
    