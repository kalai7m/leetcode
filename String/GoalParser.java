package String;
//https://leetcode.com/problems/goal-parser-interpretation
//1678
public class GoalParser {
    static String interpret(String command) {
        int i=0;
        StringBuilder sb = new StringBuilder();
        while(i<command.length()) {
            if(command.charAt(i)=='(' && i+1 < command.length()){
                if(command.charAt(i+1) == 'a'){
                    sb.append("al");
                    i=i+4;
                }else if(command.charAt(i+1) == ')'){
                    sb.append("o");
                    i=i+2;
                }
            }else if(command.charAt(i)=='G'){
                sb.append("G");
                i=i+1;
            }
        }
        return sb.toString();
    }
    public static void main(String[] args) {
        System.out.println(interpret("G()(al)"));
    }
}
