public class Mulltilevel_inhe {
    public static void main(String[] args) {
        c s=new c();
        s.mul();s.add();s.rem();s.sub();
    }
}
class A{//paarent
    int a,b,c;
    void add(){
        a=10;b=23;
        System.out.println(a+b);
    }
    void sub(){
        a=200;b=100;
        System.out.println(a-b);
    }
}
class B extends A{
    void mul(){
        a=10;b=9;
        System.out.println(a*b);
    }
    void div(){
        a=30;b=10;
        System.out.println((float)a/b);
    }
}
class c extends B{
    void rem(){
        a=30;b=10;
        System.out.println(a%b);
    }
}

