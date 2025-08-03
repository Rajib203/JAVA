public class Multiplae_try_catchBlock {
    public static void main(String[] args) {
        try
        {
            int a=10,b=0,c;
            c=a/b;
            System.out.println(c);
        }
        catch(ArithmeticException e)
        {
            System.out.println("cannot divide by zero" +e.getMessage());

        }
        try{
            int a[]={1,2,3,4,5};
            System.out.println(a[6]);
        }
        catch(ArrayIndexOutOfBoundsException f)
        {
            System.out.println("Array not in this position "+f.getMessage());
        }
        finally{
            System.out.println("For checking all block successfully...");
        }
    }
}
