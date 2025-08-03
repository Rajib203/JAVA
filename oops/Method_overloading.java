public class Method_overloading {
    public static void main(String[] args) {
        calculator cal=new calculator();
        System.out.println(cal.sum(1,2));
        System.out.println(cal.sum(1.5,2.4));
        System.out.println(cal.sum(1,2,3));
    }

}
class calculator{
    int sum(int a,int b)
    {
        return a+b;
    }
    double sum(double a,double b)
    {
        return a+b;
    }
    int sum(int a,int b,int c)
    {
        return a+b+c;
    }
}
