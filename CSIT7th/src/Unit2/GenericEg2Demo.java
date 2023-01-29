
package Final;
//creating a generic class accepting multiple parameter
class Box<T,U,W>{
    private T length;
    private U breadth;
    private W height;
    //constructor
    public Box(T length,U breadth, W height){
        this.length=length;
        this.breadth=breadth;
        this.height=height;
    }
    public void displayBox(){
        System.out.println("length of box is "+length);
        System.out.println("breadth of box is "+breadth);
        System.out.println("height of box is "+height);
    }
    //returning length
    public T getLength(){
        return length;
    }
    public U getBreadth(){
        return breadth;
    }
    public W getHeight(){
        return height;
    }
}
public class GenericEg2Demo {
    public static void main(String[] args) {
    Box <Integer,Integer,Integer>b1 = new Box<Integer,Integer,Integer>(3,3,4);
    b1.displayBox();
    Integer len1 = b1.getLength();
    Integer bre1 = b1.getBreadth();
    Integer hei1 = b1.getHeight();
  System.out.println("vol of b1 is "+(len1*bre1*hei1));
Box <Integer,Double,Double>b2 = new Box<Integer,Double,Double>(2,3.5,5.5);
  b2.displayBox();
 Integer len2= b2.getLength();
 Double bre2 = b2.getBreadth();
 Double hei2 = b2.getHeight();
        System.out.println("vol is "+(len2*bre2*hei2));
    }
}
