public class Exception_propagation {
    public static void main(String[] args) {
        m1();
    }
    public static void m1()
    {
        try{
            m2();

        }
        catch(ArithmeticException e)
        {
            System.out.println("Exception handled... in m1"+e.getMessage());
        }
    }
    public static void m2()
    {
        System.out.println(10/0);
    }
    
}
