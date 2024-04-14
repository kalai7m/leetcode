package String;
//https://leetcode.com/problems/check-if-two-string-arrays-are-equivalent/description/
public class CheckIfTwoStringArraysareEquivalent {
    static boolean arrayStringsAreEqual(String[] word1, String[] word2) {
        StringBuilder sb = new StringBuilder();
        StringBuilder sb1 = new StringBuilder();
        for (String w : word1) sb.append(w);
        for (String w : word2) sb1.append(w);
        return sb.toString().equals(sb1.toString());
    }

    public static void main(String[] args) {
        String[] w1 = new String[]{"ab", "c"};
        String[] w2 = new String[]{"a", "bc"};
        System.out.println(arrayStringsAreEqual(w1, w2));
    }
}
