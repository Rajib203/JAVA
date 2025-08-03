import java.util.Scanner;
public class Stringinput {
    public static void priintArray(String str )
    {
        for(int i=0;i<str.length();i++)
        {
            System.out.print(str.charAt(i)+" ");//for separate character and give a space
        }
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the string:");
        String name=sc.nextLine();
        System.out.println("your name is: "+name);
        System.out.println(name.length());//Length method
        String name1="sk";
        String name2="Rajib";
        String fullname=name1+" "+name2;//concatenation method
        System.out.println("your full name is: "+fullname.charAt(0));//For charAt method
        priintArray(fullname);
        // System.out.println("your full name is: "+fullname);
    }
    
}
