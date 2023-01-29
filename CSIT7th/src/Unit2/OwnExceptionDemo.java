package Unit3;
//exception class
class Divideby3Exception extends Exception{
    public String toString(){
        return "number divisible 3 are not allowed";
    }
}
class Calculations{
    public void check(int num)throws Divideby3Exception{
        if(num%3==0){
           throw new Divideby3Exception(); 
        }else{
            System.out.println(num);
        }
    }
}
public class OwnExceptionDemo {
    public static void main(String[] args) {
       Calculations c1 = new Calculations();
       try{
             c1.check(36); 
       }catch(Divideby3Exception d){
           System.out.println(d);
       }
    
    }
  
}
