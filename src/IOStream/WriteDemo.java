package IOStream;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class WriteDemo {

    public static void main(String[] args) throws IOException {
        String data="Welcome to Bridgelabz";
        try {
            FileOutputStream f =new FileOutputStream("E:\\demo1.txt");
            byte[] arr=data.getBytes();
            f.write(arr);
        }catch (FileNotFoundException e){
            e.printStackTrace();
        }catch (IOException e){
            e.printStackTrace();
        }

    }
}
