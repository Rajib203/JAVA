package Recursion;

public class Friend_pairing {
    public static int frindpairs(int n)
    {
        if(n==1 || n==2)
        {
            return n;
        }
        int fnm1=frindpairs(n-1);
        int fnm2=frindpairs(n-2);
        int pairways=(n-1)*fnm2;
        int totalways =pairways+fnm1;
        return totalways;

    }
    public static void main(String[] args) {
        System.out.println(frindpairs(3));
    }
}
