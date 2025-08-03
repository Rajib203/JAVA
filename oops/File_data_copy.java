import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class File_data_copy {
    public static void main(String[] args) throws IOException {
        FileInputStream r= new FileInputStream("C:\\Users\\skraj\\OneDrive\\Desktop\\apnaclg\\oops\\rabiya.txt");
        FileOutputStream w= new FileOutputStream("C:\\Users\\skraj\\OneDrive\\Desktop\\apnaclg\\oops\\rajib.txt");
        
        int i;
        while((i=r.read())!=-1)
        {
            w.write((char)i);
        }
        System.out.println("Data copied sucessfully..");

    }
}
