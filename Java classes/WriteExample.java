import java.io.*;
public class WriteExample{
    public static void main(String[] args){
        try{
            Writer writer = new FileWriter("Write.txt");
            writer.write("Hello this is beign written by the command line");
            writer.close();
        }catch(IOException e){
            System.out.println("An error occurred while writing to the file: " +e.getMessage());
        }
    }
}