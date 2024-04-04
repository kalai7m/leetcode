package HashmapPkg;
//https://leetcode.com/problems/first-unique-character-in-a-string/description/
import java.util.HashMap;

public class FirstUniqueChar {
    static int firstUniqChar(String s) {
        HashMap<Character, Integer> hm = new HashMap<>();
        int res=-1;
        for(int i=0;i<s.length(); i++) {
            if(hm.containsKey(s.charAt(i)))
                hm.put(s.charAt(i),hm.get(s.charAt(i))+1);
            else
                hm.put(s.charAt(i),1);
        }
        for(int i=0;i<s.length(); i++) {
            if(hm.get(s.charAt(i)) == 1)
            {res=i;break;}
        }
        return res;
    }
    public static void main(String[] args) {
        System.out.println(firstUniqChar("leetcode"));
    }
}
