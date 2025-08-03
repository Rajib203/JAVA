public class count_set_Bits {
    public static int countset_Bits(int n)
    {
        int count=0;
        while(n>0)
        {
            if((n&1)!=0)//check LSB 1 COUNT++
            {
                count++;
            }
            n=n>>1;
        }
        return count;
    }
    public static void main(String[] args) {
        System.out.println(countset_Bits(10));
    }
}
