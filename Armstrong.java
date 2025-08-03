import java.util.Scanner;
public class Armstrong {
    public static void main(String[] args) {
        int n,c,r,arm=0;
        Scanner in=new Scanner(System.in);
        n=in.nextInt();
        c=n;
        while(n>0)
        {
            r=n%10;
            arm=(r*r*r)+arm;
            n=n/10;
        }
        if(c==arm)
        {
            System.out.println("armstrong");
        }
        else{
            System.out.println("not armstrong number");
        }
    }
}
