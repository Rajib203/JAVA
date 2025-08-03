import java.util.Scanner;
public class Inventor_java {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String correctAnswer="James Gosling";
        int attempts=3;
        System.out.println("Who is inventor of java");
        for(int i=1;i<=attempts;i++)
        {
            String userString=in.nextLine();

            if(userString.equalsIgnoreCase(correctAnswer))
            {
                System.out.println("Good");
                break;
            }
            else{
                if(i<attempts)
                {
                    System.out.println("Try Again.");
                }
                else{
                    System.out.println("You have reached maximum Attempts..");
                }
            }
        }
    }
}
