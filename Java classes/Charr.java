import java.io.*;

public class Charr{
    public static void main(String[] args){
        try{
            FileReader fr =  new FileReader("unit.txt");
            int ch;
        while((ch = fr.read()) != -1) {
            System.out.println((char) ch);
        }
        fr.close();
    }catch(IOException e){
        System.out.println("An error occurred while reading the file: " +e.getMessage());
        }
    }
}
////Character Stream