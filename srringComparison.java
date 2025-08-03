public class srringComparison {
    public static void main(String[] args) {
        String s1="Tony";
        String s2="Tony";
        String s3=new String("Tony");
        //This is check for object level equal or not
        if(s1==s2)
        {
            System.out.println("same string");
        }
        else{
            System.out.println("not equal");
        }
        //This is check for object level equal or not
        if(s1==s3)
        {
            System.out.println("same string");
        }
        else{
            System.out.println("not equal");
        }
        //this is check value level by this method
        if(s1.equals(s3))
        {
            System.out.println("same string");
        }
        else{
            System.out.println("not equal");
        }
    }
}
