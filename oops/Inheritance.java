public class Inheritance {
    public static void main(String[] args) {
        Fish tuna=new Fish();
        tuna.eat();
        tuna.breathes();
        
        
    }
}
class Animal{
    String clolor;
    void eat(){
        System.out.println("eats");
    }
    void breathes()
    {
        System.out.println("Breathes...");
    }
}
class Fish extends Animal{
    int fins;
    void swims()
    {
        System.out.println("swims in water...");
    }
}