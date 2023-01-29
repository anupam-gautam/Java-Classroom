package Final;
//creating generic class
class Shows <T>{
    private T num;
    //constructor
    public Shows(T num){
        this.num=num;
    }
    public void displayData(){
        System.out.println("value of num is"+num);
    }
}
public class GenericEG1Demo {
    public static void main(String[] args) {
      //creating object generic class
 Shows <Integer>s1 = new Shows<Integer>(30);
 s1.displayData();
 Shows <String>s2 = new Shows<String>("hello BIM");
 s2.displayData();
 Shows <Character> s3 = new Shows<Character>('a');
 s3.displayData();
 Shows <Double>s4 = new Shows<Double>(800.5);
 s4.displayData();
    }
  
}
