public class Interrrupt {
    public static void main(String[] args) {
        A t1= new A();

        t1.start();
        t1.interrupt();

        
    }
}
class A extends Thread
{
    public void run()
    {
        try{
            for(int i=1;i<=5;i++)
            {
                System.out.println("t1 thread calling...");
                Thread.sleep(3000);
            }
        }
        catch(InterruptedException e)
        {
            System.out.println("t1 exception handled...!"+e.getMessage());
        }
    }
}