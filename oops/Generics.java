public class Generics {
    public static void main(String[] args) {
        Dog<String> d1=new Dog<>("eee");
        System.out.println(d1.id);
        
    }
}
class Dog<E>
{
    E id;
    public Dog(E id)
    {
        this.id=id;
    }
}
