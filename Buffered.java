import java.io.*;

public class Buffered{
    public static void main(String[] args) {
        try{
            FileOutputStream fos = new FileOutputStream("test.txt");
            BufferedOutputStream bos = new BufferedOutputStream(fos);
            String data = "Hello from Buffered OutputStream!";
            bos.write(data.getBytes());
            bos.flush();
            bos.close();
            bos.close();
        }
        catch(IOException e){
            e.printStackTrace();
        }
    }
}