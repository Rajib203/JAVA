import java.util.Scanner;;
public class Prime_Lc {
    public static void main(String[] args) {
        int n,count=0;
        Scanner in=new Scanner(System.in);
        System.out.println("Enter the number ");
        n=in.nextInt();
        for(int i=1;i<=n;i++)
        {
            if(n%i==0)
            {
                count++;
            }
        }
        if(count==2)
        {
            System.out.println("prime");
        }
        else{
            System.out.println("not prime");
        }
    }
}
