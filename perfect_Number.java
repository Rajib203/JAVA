import java.util.Scanner;
public class perfect_Number {
    public static void main(String[] args) {
        // int n,sum=0;
        Scanner in=new Scanner(System.in);
        int n,sum=0;
        n=in.nextInt();
        for(int i=1;i<n;i++)
        {
            if(n%i==0)
            {
                sum+=i;
            }
        }
        if(n==sum)
        {
            System.out.println("perfect..");
        }
        else{
            System.out.println("not perfect");
        }
    }
}
