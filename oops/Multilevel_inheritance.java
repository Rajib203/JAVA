public class Multilevel_inheritance {
        public static void main(String[] args) {
            // Fish tuna=new Fish();
            // tuna.eat();
            // tuna.breathes();
            dog dobby=new dog();
            dobby.eat();
            dobby.legs=3;
            dobby.number=3;
            System.out.println(dobby.number);
            System.out.println(dobby.legs);
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
    class mamal extends Animal{
        int legs;

    }
    class dog extends mamal{
        int number;
    }
    // class Fish extends Animal{
    //     int fins;
    //     void swims()
    //     {
    //         System.out.println("swims in water...");
    //     }
    // }

