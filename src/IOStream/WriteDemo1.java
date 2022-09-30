package IOStream;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;

public class WriteDemo1 {

    public static void main(String[]args) throws IOException {
        File file=new File("E:\\Demo.txt");
        try {
            FileOutputStream fos= new FileOutputStream(file);
            fos.write(66);
            System.out.println("Done");
        }catch (IOException e){
            e.printStackTrace();
        }


    }
}
