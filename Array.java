import java.util.Scanner;

public class Array {
    public static void main(String[] args) {
        int marks[]=new int[60];
        Scanner in=new Scanner(System.in);
        marks[0]=98;
        marks[1]=45;
        marks[2]=56;
        System.out.println("phy "+marks[0]);
        System.out.println("chem "+marks[1]);
        System.out.println("math "+marks[2]);
        marks[0]=marks[0]+2;
        System.out.println("phy "+marks[0]);

    }
}
