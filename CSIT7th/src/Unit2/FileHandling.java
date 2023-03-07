import java.io.*;


//using Byte Stream
public class MyClass {
    public static void main(String args[]) {
      File file = new File("demo.txt");
      bytes []msg = "Hello all".getBytes();
      FileOutputStream output = new FileOutputStream(file);
      output.write(msg);
      output.close();
      
      FileInputStream input = new FileInputStream(file);
      FileBufferedInputStream buff_input = new FileBufferedInputStream(input);
      while(buff_input.read(read)!= -1){
          system.out.println(read);
      }
      buff_input.close();
      input.close();
    }
}

//using Character Stream
public class MyClass{
    public static void main(String[] args){
      File file = new File("demo.txt");
      String msg = "Hello all";
      FileWriter output = new FileWriter(file);
      output.write(msg);
      output.close();
      
      FileReader input = new FileReader(file);
      BufferedReader buff_input = new BufferedReader(input);
      String line;
      while(line = buff_input.readLine() != null){
          system.out.println(line);
      }
      buff_input.close();
      input.close();
    }
}