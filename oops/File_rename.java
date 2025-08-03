import java.io.File;

public class File_rename {
    public static void main(String[] args) {
        File f= new File("C:\\Users\\skraj\\OneDrive\\Desktop\\apnaclg\\oops\\rajib.txt");
        File r= new File("C:\\Users\\skraj\\OneDrive\\Desktop\\apnaclg\\oops\\rabiya.txt");

        if(f.exists())
        {
            System.out.println(f.renameTo(r));
        }
        else{
            System.out.println("File does not exists..");
        }

    }
}
