import java.util.Scanner;
public class Multiply {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        System.out.print("enter the value of a: ");
        int a=in.nextInt();
        System.out.println("Enter the value of b: ");
        int b=in.nextInt();
        int mul=a*b;
        System.out.println("The Multiplication is: "+mul);
    }
}
