public class try_catch_block {
    public static void main(String[] args) {
        String str="rajib";
        try{
            int a=Integer.parseInt(str);
            System.out.println(a);
        }
        catch(NumberFormatException e){
            System.out.println("str "+str+" cannot be converted...");
        }
        System.out.println("Main method executed..!");
    }
}
