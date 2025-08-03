public class clear_range_ofbits {
    public static int range(int n,int i,int j){
        int a=((~0)<<(j+1));
        int b=(1<<i)-1;
        int bitmask=a|b;
        return n & bitmask;
    }
    public static boolean istwopower(int n)
    {
        return (n&(n-1))==0;
    }
    public static void main(String[] args) {
        // System.out.println(range(15, 2, 4));
        System.out.println(istwopower(13));
    }
}
