import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class File_write {
    public static void main(String[] args) {
        try{
              FileWriter f= new FileWriter("C:\\Users\\skraj\\OneDrive\\Desktop\\apnaclg\\oops\\rajib.txt");
              try{
                f.write("i love my mommy");
              
              }
              finally
              {
                f.close();
              }
        }
        catch(IOException i)
        {
            System.out.println("Exception handled..."+i);
        }
    }
}
