public class Method_overriding {
    public static void main(String[] args) {
        deer d=new deer();
        d.eat();
    }
}
class Animal{
    void eat()
    {
        System.out.println("Eat everythig..");
    }
}
class deer extends Animal{
   
    void eat()
    {
        
        System.out.println("Eat grass...");
    }
}
