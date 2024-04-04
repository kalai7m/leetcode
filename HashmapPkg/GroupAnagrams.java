package HashmapPkg;
//https://leetcode.com/problems/group-anagrams/description/
import java.util.*;

public class GroupAnagrams {
    static List<List<String>> groupAnagrams(String[] strs) {
        HashMap<String, List<String>> hm = new HashMap<>();
        List<List<String>> res = new ArrayList<List<String>>();
        for (String s : strs) {
            char[] ch = s.toCharArray();
            Arrays.sort(ch);
            String newS = String.valueOf(ch);
            if (hm.containsKey(newS)) {
                List<String> l = hm.get(newS);
                l.add(s);
                hm.put(newS, l);
            } else {
                List<String> l = new ArrayList<>();
                l.add(s);
                hm.put(newS, l);
            }
        }
        for(Map.Entry<String, List<String>> e: hm.entrySet()) {
            res.add(e.getValue());
        }
        return res;
    }
    public static void main(String[] args) {
        String []str = new String[]{"eat","tea","tan","ate","nat","bat"};
        List<List<String>> res = groupAnagrams(str);
        System.out.println(res);
    }
}
