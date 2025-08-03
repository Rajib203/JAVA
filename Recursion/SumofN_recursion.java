package Recursion;

public class SumofN_recursion {
    public static int calculatesum(int n)
    { 
        if(n==1)
        {
            return 1;
        }
        int snm1=calculatesum(n-1);
        int sn=n+snm1;
        return sn;
    }
    public static void main(String[] args) {
        int n=5;
        System.out.println(calculatesum(n));
    }
}
