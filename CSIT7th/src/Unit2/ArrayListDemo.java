
package Final;
import java.util.*;
public class ArrayListDemo {
    public static void main(String[] args) {
  ArrayList<String>al1=new ArrayList<String>();
  al1.add("java");
  al1.add("OB");
  al1.add("DL");
  al1.add("BC");
  al1.add("DS");
  //accessing data from array list
        System.out.println(al1.get(0));
        System.out.println(al1.get(1));
   //accessing using foreach loop
        System.out.println("--------------------");
    for(String var1:al1){
        System.out.println(var1);
    }
        System.out.println("--------------");
    //accessing using for loop
    for(int i=0;i<al1.size();i++){
        System.out.println(al1.get(i));
    }
    }
 
}
