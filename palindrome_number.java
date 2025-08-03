import java.util.Scanner;;
public class palindrome_number {
    public static void main(String[] args) {
        int n,s=0,c,r;
        Scanner in=new Scanner(System.in);
        n=in.nextInt();
        c=n;
        while(n>0)
        {
            r=n%10;
            s=(s*10)+r;
            n=n/10;
        }
        if(c==s)
        {
            System.out.println("Palindrome");
        }
        else{
            System.out.println("Not palindrome");
        }
        
    }
}
