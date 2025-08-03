import java.util.Scanner;
public class Calculator {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        System.out.print("enter the value of a:");
        int a=in.nextInt();
        System.out.print("Enter the value of b:");
        int b=in.nextInt();
        System.out.println("Enter the operator:");
        char op=in.next().charAt(0);
        switch(op){
            case '+':System.out.println(a+b);
                    break;
            case '-':System.out.println(a-b);
                    break;
            case '*':System.out.println(a*b);
                    break;
            case '/':System.out.println(a/b);
                    break;
            case '%':System.out.println(a%b);
                    break;
            default:System.out.println("wrong operator");
            


        }


    }
    
} 
