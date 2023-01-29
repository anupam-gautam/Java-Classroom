
package Unit3;

class Solution{
    //method overloading condition
    public void solve (int x, int y){
        System.out.println("sum is "+(x+y));
    }
    public void solve(int x,int y, int z){
        System.out.println("multiplication is "+(x*y*z));
    }
    public void solve (double x,double y){
        System.out.println("division is "+(x/y));
    }
    public int solve(int x){
        return (x*x);
    }
}
public class MethodOverloadingDemo {
    public static void main(String[] args) {
        Solution s1 = new Solution();
        s1.solve(20, 20);
        s1.solve(5, 10, 20);
        s1.solve(5.5,6.5);
       int res =  s1.solve(10);
        System.out.println(res);
    }
    
}
