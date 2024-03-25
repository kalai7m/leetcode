import java.util.HashMap;

public class IsomorphicStrings {
    static boolean isIsomorphic(String s, String t) {
        if(s.length() != t.length()) return false;
        HashMap<Character, Character> mp=new HashMap<>();
        for(int i=0;i< s.length();i++) {
            if(!mp.containsKey(s.charAt(i))) {
                if(!mp.containsValue(t.charAt(i))){
                    mp.put(s.charAt(i),t.charAt(i));
                }else return false;
            } else if (t.charAt(i) != mp.get(s.charAt(i))) return false;
        }
        return true;
    }
    public static void main(String[] args) {
        System.out.println(isIsomorphic("egg","add"));
        System.out.println(isIsomorphic("foo","bar"));
        System.out.println(isIsomorphic("sssttst","aaabbba"));
    }
}
