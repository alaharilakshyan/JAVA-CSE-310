import java.io.*;
public class Buff{
    public static void main(String[] args){
        try{
            BufferedWriter bw = new BufferedWriter(new FileWriter("File.txt"));
            bw.write("This file is the example of the BufferedWriter along with the FIleWriter!");
            bw.newLine();
        }
    }
}