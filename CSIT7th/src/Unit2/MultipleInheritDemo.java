
package Unit3;
//multiple inheritance 
interface Calculator1{
    int sumEven(int x, int y);
    int sumOdd(int x, int y);
}
interface Calculator2{
    void findPrime(int x);//finds whether the parameter values is prime or not
}
class Solve implements Calculator1, Calculator2{

    @Override
    public int sumEven(int x, int y) {
        //throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    int sum=0;
    for(int i=x;i<=y;i++){
        if(i%2==0){
            sum+=i;
    }
    }
    return sum;
    }
    @Override
    public int sumOdd(int x, int y) {
        int sum1=0;
        //throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    for(int i=x; i<=y; i++){
        if(i%2!=0){
            sum1+=i;
        }
    }
    return sum1;
    }
    @Override
    public void findPrime(int x) {
        //throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    int count=0;
    for(int i=1;i<=x;i++){
        if(x%i==0){
            count++;
        }
    }
    if(count==2){
        System.out.println("no. is prime");
    }else{
        System.out.println("no. is not prime");
    }
    }   
}
public class MultipleInheritDemo {
    public static void main(String[] args) {
        Solve s1 = new Solve();
        s1.findPrime(7);
        int sumOdd = s1.sumOdd(30, 50);
        int sumEven = s1.sumEven(50, 80);
        System.out.println("sum of odd no. is "+sumOdd);
        System.out.println("sum of even no. is "+sumEven);
    }
}
