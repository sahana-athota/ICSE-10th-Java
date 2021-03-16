import java.util.Scanner;
public class aaray29
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
       String co[]={"India","Afghanistan","Albania","Algeria","Andorra","Angola","Argentina","Armenia","Australia","Austria","Azerbaijan","Bahamas","Bahrain","Bangladesh","Barbados","Belarus","Belgium","Belize","Benin","Bhutan"};
       String ca[]={"Delhi","Kabul","Tirana","Algiers","Andorra la Vella","Luanda","Buenos Aires","Yerevan","Canberra","Vienna","Baku","Nassau","Manama","Dhaka","Bridgetown","Minsk","Brussels","Belmopan","Porto-Novo","Thimphu"};
       System.out.println("enter a country's name");
       String a=sc.nextLine();
       int i,count=0;
       for(i=0;i<=19;i++)
       {
           if(co[i].equals(a))
           {
                System.out.println(ca[i]);
                count++;
           }
        }
        if(count==0)
        {
            System.out.println("error");
        }
    }
}
                