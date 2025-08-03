public class nested_catch_block {
    public static void main(String[] args) {
        try{
            System.out.println(10/0);
        }
        catch(Exception e)
        {
            System.out.println("cannot divided by zero..");
            try{
                String a="ANKIT";
                System.out.println(a.toLowerCase());
            }
            catch(NullPointerException r)
            {
                System.out.println("null cannot cascade");
            }
        }
        System.out.println("Main method executed successfully...");
    }
}
