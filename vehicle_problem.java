import java.util.Scanner;

public class vehicle_problem {
    public static void main(String[] args){
        Scanner in =new Scanner(System.in);
        int V=in.nextInt();
        int W=in.nextInt();

        if(W<2*V || W>4*V || W%2!=0){
            System.out.println("Invalid Input");
        }
        else{
            int fourWheelers=(W-2*V)/2;
            int twoWheelers=V-fourWheelers;
            System.out.println("Number of Two Wheelers: "+twoWheelers);
            System.out.println("Number of Four Wheelers: "+fourWheelers);
        }
    }
}
