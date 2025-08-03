public class extending_interfaces {
    public static void main(String[] args) {
        Rajib r= new Rajib();
        r.add();r.sub();
    }
}
interface A{
    void add();
}
interface B extends A{
    void sub();
}
class Rajib implements B{
    @Override
    public void add(){
        int a=10,b=20;
        int c=a+b;
        System.out.println("Addition: "+c);
    }
    @Override
    public void sub(){
        int a=20,b=10;
        int c=a-b;
        System.out.println("Subtraction: "+c);
    }
}