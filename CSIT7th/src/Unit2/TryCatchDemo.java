package Unit3;
import java.util.Scanner;
public class TryCatchDemo {
    public static void main(String[] args) {
        try{
            Scanner sc = new Scanner(System.in);
            int num1,num2,div;
            System.out.println("enter first number");
            num1 = sc.nextInt();
            System.out.println("enter second number");
            num2 = sc.nextInt();
            div = num1/num2;//if num2==0 then exception occur   
            System.out.println(div);
            //array index error
            int []arr = {2,4,6,8,10};
            arr[130]=100;//arrayindexoutofbounds
        }catch(ArithmeticException ae){
            System.out.println("cannot divide by zero"+ae);
        }catch(ArrayIndexOutOfBoundsException ae){
            System.out.println(ae);
        }catch(Exception e){
            System.out.println(e);
        }finally{
            System.out.println("everything run inside finally");
        }
        System.out.println("code after catch");
    }
  
}
