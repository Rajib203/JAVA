import java.util.Scanner;
public class funcfact {
    public static int factorial(int n)
    {
        int f=1;
        for(int i=1;i<=n;i++)

        {
            f=f*i;
        }
        return f;
    }
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        System.out.print("Enetr the value of A: ");
        int a=in.nextInt();
        int fact=factorial(a);
        System.out.println("The factorial is " + fact);
    //    System.out.println(factorial);
    }
    
}
