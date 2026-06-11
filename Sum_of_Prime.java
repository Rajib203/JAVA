import java.util.*;
public class Sum_of_Prime {
    public static boolean isPrime(int n){
        if(n<=1){
            return false;
        }
        for(int i=2;i<=n;i++){
            if(n%i==0){
                return false;
            }
        }
        return true;
    }
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        int n=in.nextInt();
        boolean found=false;
        for(int i=2;i<=n;i++){
            if(isPrime(i) && isPrime(n-i))
            {
                found=true;
                break;
            }
        }
        if(found){
            System.out.println("Yes");
        }
        else{
            System.out.println("No");
        }
    }
}
