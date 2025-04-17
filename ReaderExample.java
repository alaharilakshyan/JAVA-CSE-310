import java.io.*;
public class ReaderExample{
    public static void main(String[] args) {
        try{
            Reader reader = new FileReader("Sample.txt");
            int ch;
            while((ch = reader.read())!= -1) {
                System.out.println((char) ch);
            }
            reader.close();
        
        }catch(IOException e) {
            System.out.println("An error occurred while reading the file: " + e.getMessage());
    }
}
}