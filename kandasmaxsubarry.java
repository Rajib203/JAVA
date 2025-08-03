public class kandasmaxsubarry {
    public static void kandas(int numbers[])
    {
        int ms=Integer.MIN_VALUE;
        int cs=0;
        for(int i=0;i<numbers.length;i++)
        {
            cs+=numbers[i];
            if(cs<0)
            {
                cs=0;
            }
            ms=Math.max(cs,ms);
        }
        System.out.println("the kandes MaxArraysum is "+ms);
    }
    public static void main(String[] args) {
        int numbers[]={-2,-7,8,-1,4};
        kandas(numbers);
    }
}
