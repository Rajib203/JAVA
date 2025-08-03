public class clear_ith__Bit {
    public static int clear_Bit(int n,int i)
    {
        int bitmask=~(1<<i);
        return n&bitmask;
    }
    public static void main(String[] args) {
        System.out.println(clear_Bit(5, 2));
    }

}
