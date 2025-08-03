import java.util.Scanner;
public class LArgestinArray {
    public static int  getlargest(int numbers[])
    {
        int largest=Integer.MIN_VALUE;//-infinity
        for(int i=0;i<numbers.length;i++)
        {
            if(largest<numbers[i]){
                largest=numbers[i];
    
            }
        }
        return largest;
    }
    public static void main(String[] args) {
        int numbers[]={10,20,45,34};
        System.out.println("The largest value in array is "+getlargest(numbers));
    }
}
