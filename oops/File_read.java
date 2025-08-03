import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class File_read {
    public static void main(String[] args) {
        try{
             FileReader f=new FileReader("C:\\Users\\skraj\\OneDrive\\Desktop\\apnaclg\\oops\\rajib.txt");
             try{
                int i;
                while((i=f.read())!=-1);
                System.out.println((char)i);
             }
             finally
             {
                f.close();
             }
        }
        catch(IOException e)
        {
            System.out.println("Exception handled..."+e);
        }
    }
}
