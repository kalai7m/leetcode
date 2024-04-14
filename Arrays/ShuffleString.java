package Arrays;
//https://leetcode.com/problems/shuffle-string/description/
public class ShuffleString {
    public static void main(String[] args) {
         int index[] = new int[]{4,5,6,7,0,2,1,3};
        System.out.println(restoreString("codeleet",index));
    }

    static String restoreString(String s, int[] indices) {
        int n = s.length();
        char newStr[] = new char[n];
        for(int i=0; i<n;i++){
            newStr[indices[i]] = s.charAt(i);
            System.out.println(i+" "+indices[i]+" "+s.charAt(i));
        }
        return  new String(newStr);
    }

}
