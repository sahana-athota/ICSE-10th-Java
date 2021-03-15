import java.util.Scanner;
public class str10
{ //Replace the occurrence of a vowel with the next vowel in a String 
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
            if( b=='A' || b=='a')  
            {
                 b='e';
            }
            else if(b=='E' || b=='e')
            {
                b= 'i';
            }
            else if(b=='I' || b=='i')
            {
                b='o';
            }
            else if(b=='o' || b=='O')
            {
                b='u';
            }
            else if(b=='U' || b=='u')
            {
                b='a';
            }
            
            c= c+b;
        }
        System.out.println(""+c);
        }
    }