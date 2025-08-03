public class Covariant {
    public static void main(String[] args) {
    B b=new B();
    b.show();
    }
}
class A{
    A show()
    {
        System.out.println("Rajib is a good boy");
        return this;
    }
}
class B extends A{
    @Override
    B show(){
        super.show();
        System.out.println("Rajib is bad boy");
        return this;
    }
}