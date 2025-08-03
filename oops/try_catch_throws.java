public class try_catch_throws {
     public static void Customwait() throws InterruptedException{
        for(int i=1;i<=10;i++)
        {
            System.out.println(i);
            Thread.sleep(1000);
        }
    }
    public static void main(String[] args) throws InterruptedException {
        Customwait();
    }
}
