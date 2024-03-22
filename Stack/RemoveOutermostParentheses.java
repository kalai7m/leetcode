package Stack;

//1021. Remove Outermost Parentheses
//https://leetcode.com/problems/remove-outermost-parentheses/description/
public class RemoveOutermostParentheses {
    public static String removeOuterParentheses(String s) {
        int c=0;
        StringBuilder st = new StringBuilder();
        for(char a: s.toCharArray()) {
            if(a=='('){
                if(c!=0){
                    st.append("(");
                }
                c++;
            }else{
                c--;
                if(c!=0)st.append(')');

            }
        }
        return st.toString();
    }
    public static void main(String[] args) {
//        String s= "(()())()(())";
        String s ="(()())(())(()(()))";
        System.out.println(removeOuterParentheses(s));
    }
}
