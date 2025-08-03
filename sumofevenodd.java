import java.util.Scanner;
public class sumofevenodd {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        int number;
        int choice;
        int Evensum=0;
        int Oddsum=0;
        do{
            System.out.println("Enter the number:");
            number=in.nextInt();
            if(number%2==0)
            {
                Evensum+=number;
            }
            else{
                Oddsum+=number;
            }
            System.out.println("Enter yes for 1 no for 0");
            choice=in.nextInt();


        }
         while(choice==1);
            System.out.println("Even sum is"+Evensum);
            System.out.println("odd sum is"+Oddsum);

    }
    
}
