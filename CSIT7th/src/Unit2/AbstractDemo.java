
package Unit3;
abstract class Calc{
    //it can have instance variable
    int num1;
    int num2;
    //it can have constructor
    public Calc(int num1, int num2){
        this.num1=num1;
        this.num2 = num2;
    }
    //it can have normal method
    public void calAddition(){
        System.out.println("sum is "+(num1+num2));
    }
    //it can have abstract method
    abstract int calcDifference();
    abstract int calcMulti();
}
class Example extends Calc{
    //own properties
    int a;
    int b;
    public Example(int a, int b,int x, int y){
        super(x,y);
        this.a=a;
        this.b=b;
    }
    @Override
    int calcDifference() {
        //throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
        return (a-b);
    }

    @Override
    int calcMulti() {
       // throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    return (a*b);
    }
    
}
public class AbstractDemo {
    public static void main(String[] args) {
        Example e1 = new Example(100,50,55,20);
        e1.calAddition();
        int diff = e1.calcDifference();
       int mul= e1.calcMulti();
        System.out.println("difference is "+diff);
        System.out.println("multi is "+mul);
        //using interface reference
        Calc c1;//reference
        Example e2 = new Example(20,40,50,60);
        c1=e2;
        c1.calAddition();
        System.out.println(c1.calcDifference());
        int mul1=c1.calcMulti();
        System.out.println(mul1);
        
        
    }
}
