import java.util.Scanner;

public class Seating_problem_tcs {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        int n=in.nextInt();
        System.out.println("Enter the number of guests");
        int r=in.nextInt();
        System.out.println("Enter the number of seats");

        if(r>n){
            System.out.println("Not possible to seat all guests");
        }
        else{
            long result=1;
            for(int i=0;i<r;i++){
                result=result*(n-i);
            }
            System.out.println("Number of ways to seat guests: "+result);
        }

    }
}
