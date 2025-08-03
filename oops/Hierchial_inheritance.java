public class Hierchial_inheritance {
    public static void main(String[] args) {
        Test1 t1=new Test1();
        t1.show();
        Test2 t2=new Test2();
        t2.show();
    }
}
class Test{
    void show(){
        System.out.println("This is parent clas....");
    }
}
class Test1 extends Test{
    public void show()
    {
        System.out.println("this is the 1st child");
    }
}
class Test2 extends Test{
    public void show()
    {
        System.out.println("This is 2nd child");
    }
}
