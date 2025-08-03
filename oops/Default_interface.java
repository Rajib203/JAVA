public class Default_interface {
    public static void main(String[] args) {
        B b=new B();
        b.a1();b.a2();b.a3();
        C c=new C();
        c.a1();c.a2();
    }
}
interface A{
    void a1();
    void a2();
    default void a3(){
        System.out.println("This method may or may not be implements");
    }

}
class B implements A{
    public void a1(){
        System.out.println("B class a1 methos a1()");
    }
    public void a2(){
        System.out.println("B class method a2()");
    }
}
class C implements A{
    public void a1(){
        System.out.println("C class method a1()");
    }
    public void a2(){
        System.out.println("C class method a2()");
    }
}