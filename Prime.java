import java.util.Scanner;
public class Prime {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        System.out.print("Enter the value of n: ");
        int n=in.nextInt();
        int count=0;
        if(n<=1)
        {
            System.out.println("This is not a prime number");
            return;
        }
        //Do for loop
        for(int i=1;i<=n/2;i++)
        {
            if(n%i==0)
            {
                count++;
            }
        }
        if(count>1)
        {
            System.out.println("This is not a prime");
        }
        else{
            System.out.println("This is a prime number");
        }
    }
}
