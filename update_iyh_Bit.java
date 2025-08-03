public class update_iyh_Bit {
    public static int clear_Bit(int n,int i)//This method borrow for clear_bit method
    {
        int bitmask=~(1<<i);
        return n&bitmask;
    }
    public static int updateIthBit(int n,int i,int newbit)
    {
        n=clear_Bit(n,i);
        int bitmask=newbit<<i;
        return n|bitmask;
    }
    public static int clearlast_ibit(int n,int i)
    {
        int bitmask=(~0)<<i;
        return n & bitmask;

    }
    public static void main(String[] args) {
        // System.out.println(updateIthBit(10, 2, 1));
        System.out.println(clearlast_ibit(15,2));
    }
}
