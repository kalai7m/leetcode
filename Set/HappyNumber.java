package Set;

import java.util.HashSet;
import java.util.Set;

public class HappyNumber {
//    static boolean isHappy(int n) {
//        int s=0,r,n1;
//        while(n>0 || s>9) {
//            if(n==0){
//                n=s;
//                s=0;
//            }
//            r=n%10;
//            s+=(r*r);
//            n=n/10;
//
//        }
//        return s==1 || s==7;
//    }

    static boolean isHappy(int n) {
        Set<Integer> numbers = new HashSet<>();
        while(n != 1 && !numbers.contains(n)){
            numbers.add(n);
            n = squaredDigits(n);
        }
        return n == 1;
    }

    static int squaredDigits(int number){
        int newNumber = 0, i = 1;
        while(number != 0){
            i = number % 10;
            newNumber = newNumber + (i*i);
            number /= 10;
        }
        return newNumber;
    }

    public static void main(String[] args) {
        System.out.println(isHappy(1111111)?"Happy no":"not");
    }
}
