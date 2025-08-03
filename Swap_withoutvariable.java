public class Swap_withoutvariable {
    public static void main(String[] args) {
        int x=5;
        int y=8;
        x=x^y;
        y=x^y;
        x=x^y;
        System.out.println("after swap"+x+"second"+y);
    }
}
