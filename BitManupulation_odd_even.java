public class BitManupulation_odd_even {
    public static void oddoreven(int n)
    {
        int Bitmask=1;
        if((n & Bitmask)==0)
        {
            System.out.println("the number is even ");
        }
        else
        {
            System.out.println("the number is odd ");
        }
    }
    public static void main(String[] args) {
        oddoreven(4);
        oddoreven(3);
    }
}
