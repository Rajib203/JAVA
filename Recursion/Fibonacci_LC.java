package Recursion;

public class Fibonacci_LC {
    int n,c,a=0,b=1;
    public void fibonacci(int n){
        if(n>0){
            c=a+b;
            a=b;
            b=c;
            System.out.print(c+" ");
            fibonacci(n-1);
        }
    }
    public static void main(String[] args) {
        Fibonacci_LC obj=new Fibonacci_LC();
        int n=10;
        System.out.print(obj.a+" "+obj.b+" ");
        obj.fibonacci(n-2);
    }
}
