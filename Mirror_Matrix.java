import java.util.Scanner;

public class Mirror_Matrix{
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        int matrix[][]=new int[2][2];
        System.out.print("Enter matrix element..\n");
        for(int i=0;i<=1;i++)
        {
            for(int j=0;j<=1;j++){
                matrix[i][j]=in.nextInt();
            }
        }
        System.out.print("The matrix element are..\n");
        for(int i=0;i<=1;i++)
        {
            for(int j=0;j<=1;j++){
                System.out.print(matrix[i][j]+" ");
            }
            System.out.print("\n");
        }
        System.out.print("Mirror matrix are:...\n");
        for(int i=0;i<=1;i++)
        {
            for(int j=1;j>=0;j--){
                System.out.print(matrix[i][j]+" ");
            }
            System.out.print("\n");
        }

    }
}


