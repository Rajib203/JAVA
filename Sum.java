import java.util.Scanner;
public class Sum{
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        System.out.print("Enter the value of a: ");
        int a=in.nextInt();
        System.out.print("Enter the value of b: ");
        int b=in.nextInt();
        int sum=a+b;
        System.out.println("The sum is :"+sum);
         
    }
}