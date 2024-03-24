package String;
//https://leetcode.com/problems/split-a-string-in-balanced-strings/
//1221. Split a String in Balanced Strings
public class BalancedStirng {
    static int balancedStringSplit(String s) {
        int bc=0,c=0;
        for(char i: s.toCharArray()){
            if(i=='R') c++;
            else c--;
            if(c==0) bc++;
        }
        return bc;
    }
    public static void main(String[] args) {
        System.out.println(balancedStringSplit("RLRRLLRLRL"));//4
        System.out.println(balancedStringSplit("RLRRRLLRLL"));//2
    }
}

