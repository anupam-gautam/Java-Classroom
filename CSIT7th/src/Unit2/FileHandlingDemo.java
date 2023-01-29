package Unit3;
import java.io.*;
public class FileHandlingDemo {
    public static void main(String[] args) {
        //creating file
        try{
//            File f1 = new File("a.txt");
//            if(!f1.exists()){
//                f1.createNewFile();
//                System.out.println("file created");
//            }else{
//                System.out.println("file alredy exits");
//            }
    //using byte stream to write in file
//    FileOutputStream fos = new FileOutputStream("a.txt");
//    String str = "this is file handling example";
//    byte []b=str.getBytes();
//    fos.write(b);
//    String str1 = "tomorow is holiday";
//    byte []b1 = str1.getBytes();
//   fos.write(b1);
//    System.out.println("data written");
//    fos.close();
    //reading data from file using character stream
    FileInputStream fis = new FileInputStream("a.txt");
    int c;
    while((c=fis.read())!=-1){
        System.out.print((char)c);
    }
    fis.close();
        }catch(IOException e){
            System.out.println(e);
        }
        
    }
}
