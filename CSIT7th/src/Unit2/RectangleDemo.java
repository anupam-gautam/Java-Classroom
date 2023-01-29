
package Unit3;

class Rectangle{
    //creating instance variable
    private int length;
    private int breadth;
    //creating method
    public void setData(int length, int breadth){
        this.length=length;
        this.breadth=breadth;
    }
    public void display(){
        System.out.println("length of rectangle is "+length);
        System.out.println("breadth of rectangle is "+breadth);
        System.out.println("area of rectangle is "+(length*breadth));
    }
}
public class RectangleDemo {
    public static void main(String[] args) {
        Rectangle r1 = new Rectangle();
        r1.setData(50,10);
        r1.display();
    }
}
