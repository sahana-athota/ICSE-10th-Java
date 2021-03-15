import java.util.Scanner;
public class str11
{ //Read a String and display the piglatin form of the same . For example: If the given word is “King”then 
    //the Pig-Latin form is “ingKAY”. Basically all 
    //the letters from the first character till you find a vowel is moved to the end of the word and “ay” is appended after that  
    public static void main(String args[])
    {
        Scanner sc= new Scanner(System.in);
        System.out.println("enter a string");
        String a=sc.next();
        String c="";
        int e=0;
        for(int i=0;i<=(a.length()-1);i++) //sahana 1
        {
            char b=a.charAt(i);
            if((b=='a' || b=='A' || b=='E' ||b=='e' ||b=='I' ||b=='i' ||b=='O' ||b=='U' ||b=='o' ||b=='u'))
            {
                e=i-1;
                for(int j=i;j<=(a.length()-i);j++)
                {
                    char d=a.charAt(j);
                    c=c+d; //c=ahana
                }
                break;
            }
        }
        for(int i=0;i<=e;i++)
        {
           c=c+a.charAt(i);//c=ahanasay
        }
        c=c+"ay";
        System.out.println(" "+c);
    }
}
        
            