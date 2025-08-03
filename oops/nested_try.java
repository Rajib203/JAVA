public class nested_try {
    public static void main(String[] args) {
        try{
             try
            {
                int a[]={1,2,3,4,5};
                System.out.println(a[2]);

            }
            catch(ArrayIndexOutOfBoundsException e)
            {
                System.out.println(e);
            }
            System.out.println(10/0);

        }
        catch(ArithmeticException a)
        {
            System.out.println(a);
        }
        System.out.println("Main method run sccessfully..");
    }
}
