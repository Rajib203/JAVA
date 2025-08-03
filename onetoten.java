import java.util.Scanner;
public class onetoten
{
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        int n=in.nextInt();
        int counter=1;
        while(counter<=n)
        {
            System.out.println(counter);
            counter++;
        }
    }
}