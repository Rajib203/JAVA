import java.util.Scanner;

public class Function1sum {
    public static void calculatesum()
    {
        Scanner in=new Scanner(System.in);
        int a=in.nextInt();
        int b=in.nextInt();
        int sum=a+b;
        System.out.println(sum);
    }
    public static void main(String[] args) {
        calculatesum();
    }
}
