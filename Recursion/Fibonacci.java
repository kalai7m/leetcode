package Recursion;

public class Fibonacci {
    static int fibo(int n) {
        if(n<2) return n;
        return fibo(n-1) + fibo(n-2);
    }

    public static void main(String[] args) {
        System.out.println(fibo(5));
    }
}
//0 = 0
//1 = 1
//2 = 1
//3 = 2
//4 = 3
//5 = 5

