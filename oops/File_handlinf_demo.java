import java.io.File;
import java.io.IOException;

import java.io.*;
public class File_handlinf_demo {
    public static void main(String[] args) {
        File f= new File("C:\\Users\\skraj\\OneDrive\\Desktop\\apnaclg\\oops\\rajib.txt");
        try{
            if(f.createNewFile())
            {
                System.out.println("File created success fully..");
            }
            else{
                System.out.println("File already created");
            }
        }
        catch(IOException i)
        {
            System.out.println("Exception handles"+i);
        }
    }
}
