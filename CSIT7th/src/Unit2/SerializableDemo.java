package Unit3;
import java.io.*;
class Square implements Serializable{
    private int length;
    public Square(int length){
        this.length=length;
        
    }
    public void calcArea(){
        System.out.println("area is "+(length*length));
    }
    public int calcPermiter(){
        return (4*length);
    }
}
public class SerializableDemo {
    public static void main(String[] args) {
        try{
            Square s1 = new Square(300);
            //serialization: inserting object into file
//        File f1 = new File("sq.txt");
//        if(!f1.exists()){
//            f1.createNewFile();
//            System.out.println("file created");
//        }
//        FileOutputStream fos = new FileOutputStream(f1);
//        ObjectOutputStream oos = new ObjectOutputStream(fos);
//        oos.writeObject(s1);
//            System.out.println("object written in file");
        //deserialization: reading object from file
        FileInputStream fis = new FileInputStream("sq.txt");
        ObjectInputStream ois = new ObjectInputStream(fis);
            Square s2=(Square)ois.readObject();
            s2.calcArea();
            int perimeter = s2.calcPermiter();
            System.out.println("perimeter is "+perimeter);
                    
            
  }catch(IOException e){
            System.out.println(e);
        }catch(ClassNotFoundException c){
            System.out.println(c);
        }
    }
    
}
