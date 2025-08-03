public class throws_demo {
    public static void main(String[] args) throws InterruptedException
    {
        for(int i=1;i<=20;i++)
        {
            System.out.println(i);
            Thread.sleep(2000);
        }
        
    }
}
