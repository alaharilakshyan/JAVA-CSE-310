///FileWriter
import java.io.*;
    public class CharExample{
        public static void main(String[] args){
            try{
                FileWriter fw = new FileWriter("charr.txt", true);
                fw.write("Written Using the FileWriter Stream!");
                fw.close();
            }catch(IOException e){
                System.out.println("An error occurred while writing to the file: " + e.getMessage());
            }
        }
    }