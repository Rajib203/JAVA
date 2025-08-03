import java.util.Scanner;;
public class Matrix_Addition {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        int a[][]=new int[2][2];
        int b[][]=new int [2][2];
        int c[][]=new int [2][2];
        System.out.println("Enter fisrst matrix");
        for(int i=0;i<2;i++)
        {
            for(int j=0;j<2;j++)
            {
                a[i][j]=in.nextInt();           
             }
        }
        System.out.println("Enter the second matrix");
        for(int i=0;i<2;i++)
        {
            for(int j=0;j<2;j++){
                b[i][j]=in.nextInt();
            }
        }
        System.out.println("First matrix\n");
        for(int i=0;i<2;i++)
        {
            for(int j=0;j<2;j++)
            {
                System.out.println(a[i][j]+" ");
            }
            System.out.println("\n");
        }
        System.out.println("Second matrix\n");
        for(int i=0;i<2;i++){
            for(int j=0;j<2;j++)
            {
                System.out.println(b[i][j]+" ");
            }
            System.out.println("\n");
        }
        System.out.print("sum of matrix is:\n");
        for(int i=0;i<2;i++)
        {
            for(int j=0;j<2;j++)
            {
                c[i][j]=a[i][j]+b[i][j];
                System.out.print(c[i][j]+" ");
            }
            System.out.print("\n");
        }
    }
}
