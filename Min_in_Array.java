public class Min_in_Array {
    public static int getMin(int numbers[])
    {
        int min=Integer.MAX_VALUE;
        for(int i=0;i<numbers.length;i++)
        {
            if(min>numbers[i])
            {
                min=numbers[i];

            }
        }
        return min;

    }
    public static void main(String[] args) {
        int numbers[]={3,2,4,5,6,78};
        System.out.println(getMin(numbers));
    }
}
