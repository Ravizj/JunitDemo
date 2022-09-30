package IOStream;

import javax.imageio.IIOException;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class ReadDemo {
    public static void main(String[] args) throws IOException {
        try {
            FileInputStream fil =new FileInputStream("E:\\demo1.txt");
            System.out.println((char) fil.read());
        }catch (FileNotFoundException e){
            e.printStackTrace();
        }catch (IIOException e){
            e.printStackTrace();
        }


    }
}
