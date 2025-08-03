public class Default_constructor {
    public static void main(String[] args) {
        A r=new A();
        r.show();
    }

}
class A{
    int a;String c;boolean b;
    A()//Defalut
    {
        a=10;c="name";b=false;
    }
    void show()
    {
        System.out.println(a+" "+b+" "+c);
    }
}
