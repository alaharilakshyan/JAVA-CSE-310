import java.io.*;

public class InputByte{
    public static void main(String args[]) throws Exception{
        FileInputStream fis = new FileInputStream("input.txt");
        int ch;
        while((ch = fis.read()) != -1){
            System.out.print((char)ch);
        }
        fis.close();
    } 
}