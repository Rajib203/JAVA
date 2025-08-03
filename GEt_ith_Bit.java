public class GEt_ith_Bit {
    public static int getith_bit(int n,int i)
    {
        int Bitmask=1<<i;
        if((n &Bitmask)==0)
        {
            return 0;
        }
        else{
            return 1;
        }

    }
    public static void main(String[] args) {
        System.out.println(getith_bit(5, 2));
    }
}
