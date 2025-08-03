import java.util.Scanner;;
public class Transpose_Matrix {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        int a[][]=new int[2][2];
        for(int i=0;i<2;i++)
        {
            for(int j=0;j<2;j++)
            {
                a[i][j]=in.nextInt();
            }
        }
        System.out.println("Matrix is:\n");
        for(int i=0;i<2;i++)
        {
            for(int j=0;j<2;j++)
            {
                System.out.print(a[i][j]+" ");
            }
            System.out.println("\n");
        }
        System.out.println("Transpose Matrix is:\n");
        for(int i=0;i<2;i++)
        {
            for(int j=0;j<2;j++)
            {
                System.out.print(a[j][i]+" ");
            }
            System.out.println("\n");
        }
    }
}
