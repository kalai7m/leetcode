package String;
//https://leetcode.com/problems/score-of-a-string/description/
public class ScoreOfString {
    public static void main(String[] args) {
        System.out.println(scoreOfString("hello"));
        System.out.println(scoreOfString("zaz"));
    }
    static int scoreOfString(String s) {
        int res=0;
        for(int i=0;i<s.length()-1;i++) {
            res += Math.abs(s.charAt(i)-s.charAt(i+1));
        }
        return res;
    }
}
