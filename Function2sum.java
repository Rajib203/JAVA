import java.util.Scanner;

public class Function2sum {
    public static int calculatesum(int num1,int num2){//parameter
        int sum=num1+num2;
        return sum;
    }
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        System.out.print("Enter the value of a:");
        int a=in.nextInt();
        System.out.print("Enter the value of b:");
        int b=in.nextInt();
        int sum =calculatesum(a,b);//argument
        System.out.println("sum is:" + sum);
    }
}
