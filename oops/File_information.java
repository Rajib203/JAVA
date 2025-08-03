import java.io.File;

public class File_information {
    public static void main(String[] args) {
        File f= new File("C:\\Users\\skraj\\OneDrive\\Desktop\\apnaclg\\oops\\rajib.txt");

        if(f.exists())
        {
            System.out.println("File name: "+f.getName());
            System.out.println("File location: "+f.getAbsolutePath());
            System.out.println("File writable: "+f.canWrite());
            System.out.println("File Readable: "+f.canRead());
            System.out.println("File size: "+f.length());
            // System.out.println("File name: "+f.delete());

        }
        else{
            System.out.println("File does not exists");
        }
    }
}
