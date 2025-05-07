import java.io.*;

public class Output1 {
public static void main(String[] args){
    try{
        PrintStream ps = new PrintStream("null");
        ps.println("Hello using PrintStream");
        ps.close();
    }catch(Exception e){
        System.out.println(e);
    }
}    
}
