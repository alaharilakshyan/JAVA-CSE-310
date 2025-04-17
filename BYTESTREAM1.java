import java.io.*;
class BYTESTREAM1 {
    public static void main(String[] args) {
     try{
        FileInputStream fis = new FileInputStream("code.txt");
        BufferedInputStream bis = new BufferedInputStream(fis);
        int ch;
        while((ch =bis.read()) != -1){
            System.out.println((char) ch);
        }
        bis.close();
        fis.close();
    }
    catch(IOException e){
        e.printStackTrace();
        }
    }
}