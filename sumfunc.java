import java.util.Scanner;;
public class sumfunc {
    public static int calculateproduct(int num1,int num2)
    {
        int product=num1*num2;
        return product;
    }
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        int a=in.nextInt();
        int b=in.nextInt();
        int product=calculateproduct(a,b);
        System.out.println("product is "+product);
    }
    
}
