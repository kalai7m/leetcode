package Recursion;
//This is TAIL RECURSION example problem
//This is the optimized recursion technique. Why ?
public class Factorial {
    public static  int factorial(int n) {
        if(n==1) {
            return 1;
        }
        return n * factorial(n-1);
    }
    public static void main(String[] args) {
        System.out.println(factorial(4));
    }
}
//4 - 4*6 => 24
//3 - 3*2
//2 - 2*1
//1
