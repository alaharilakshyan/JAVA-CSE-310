import java.io.*;
public class bufferreader {
    public static void main(String[] args){
        try{
            BufferedReader br = new BufferedReader(new FileReader("bufffile.txt"));
            String line;
            while((line = br.readLine()) != null){
                System.out.println(line);
            }
            br.close();
        }catch(IOException e){
            System.out.println("An error occurred while reading the file: " + e.getMessage());
        }
    }
}
