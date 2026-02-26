import java.util.HashSet;
import java.util.Scanner;
public class unique_element {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        System.out.println("Enter the number of elements in the array");
        HashSet<Integer> set=new HashSet<>();
        int N=in.nextInt();
        for(int i=0;i<N;i++){
            set.add(in.nextInt());
        }
        System.out.println("The number of unique elements in the array is "+set.size());
        
    }
    
}
