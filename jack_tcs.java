import java.util.Scanner;
public class jack_tcs {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        System.out.println("Enter the number of elements in the array");
        int n=in.nextInt();
        if(n<=2)
        {
            System.out.println(n);
        }
        else{
            System.out.println((n/2)+1);
        }
        


    }
}
