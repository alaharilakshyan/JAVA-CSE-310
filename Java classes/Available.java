import java.io.*;

public class Available {
    public static void main(String[] args) {
        try{
            DataOutputStream dos = new DataOutputStream(new FileOutputStream("available.txt"));
            dos.writeInt(123);
            dos.writeDouble(99.99);
            dos.close();


            DataInputStream dis = new DataInputStream(new FileInputStream("available.txt"));
            System.out.println("INT: " + dis.readInt());
            System.out.println("DOUBLE: " + dis.readDouble());
            dis.close();
        }catch (IOException e){
            e.printStackTrace();
        }
        }
    }