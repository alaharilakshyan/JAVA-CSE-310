import java.io.*;

public class Input1{
    public static void main(String[] args) {
        try{
            InputStream Is = System.in;
            System.out.println("Enter Character: ");
            int ch = Is.read();
            System.out.println("Your Typed: "+(char) ch);
        } catch(IOException e) {
            e.printStackTrace();
        }
    }
}