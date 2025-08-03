import java.util.*;
public class Arraysmallest {
    public static int getsmallest(int numbers[])
    {
        int smallest=Integer.MAX_VALUE;
        for(int i=0;i<numbers.length;i++)
        {
            if(smallest>numbers[i])
            {
                smallest=numbers[i];
            }
        }
        return smallest;
    }
    public static void main(String[] args) {
        int numbers[]={10,4,6,7,8,2};
        System.out.println("The smallest number is "+getsmallest(numbers));
    }
}
