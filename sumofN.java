import java.util.Scanner;
public class sumofN {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        int n=in.nextInt();
        int sum=0;
        int i=1;
        while(i<=n){
            sum=sum+i;
            i++;
        }
        System.out.println(sum);
    }
     

    
}
