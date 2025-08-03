import java.util.Scanner;
public class primefunction {
    public static boolean isprime(int n)
    {
        boolean isprime=true;
        for(int i=2;i<=n-1;i++)
        {
            if(n%i==0)
            {
                isprime=false;
                break;
            }
        }
        return isprime;

        
    }
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        int n=in.nextInt();

       System.out.println(isprime(n));

       
    }
}
