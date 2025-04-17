import java.io.*;

public class BYTESTREAM{
    public static void main(String args[]) throws Exception{
        FileOutputStream fos = new FileOutputStream("output.txt");
        String data = "Hello from BYTESTREAM";
        fos.write(data.getBytes());
        fos.close();
    }
}