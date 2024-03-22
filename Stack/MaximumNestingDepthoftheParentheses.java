package Stack;

//1614. Maximum Nesting Depth of the Parentheses
//https://leetcode.com/problems/maximum-nesting-depth-of-the-parentheses/description/
public class MaximumNestingDepthoftheParentheses {
    static int maxDepth(String s) {
        if(s.isBlank()) return 0;
        int d = 0;
        int maxdepth=0;
        for(char a: s.toCharArray()) {
            if(a=='(') {
                d++;
            } else if(a==')') {
                maxdepth=Math.max(maxdepth, d);
                d--;
            }
        }
        return maxdepth;
    }
    public static void main(String[] args) {
        System.out.println(maxDepth("(1+(2*3)+((8)/4))+1"));
        System.out.println(maxDepth("(1)+((2))+(((3)))"));
    }
}
