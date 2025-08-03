import java.util.concurrent.ExecutionException;

public class nested_finally {
    public static void main(String[] args) {
        try{
            String str="rajib";
            System.out.println(str.toUpperCase());
        }
        catch(Exception e)
        {
            System.out.println(e);
        }
        finally
        {
            try{
                System.out.println(10/0);
            }
            catch(ArithmeticException a)
            {
                System.out.println(a);
            }
            System.out.println("Finally maintain the resources.");
            System.out.println("Main method executed successfully...");
        }
    }
}
