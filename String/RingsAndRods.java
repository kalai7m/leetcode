package String;

import java.util.*;

public class RingsAndRods {
    static int countPoints(String rings) {
        HashMap<Character, Set<Character>> mp = new HashMap<>();
        for(int i=0;i<rings.length();i+=2){
            Set<Character> s = new HashSet<>();
//            int j = Integer.parseInt(rings.charAt(i+1));
            if(mp.containsKey(rings.charAt(i+1))){
                s=mp.get(rings.charAt(i+1));
            }
            s.add(rings.charAt(i));
            mp.put(rings.charAt(i+1),s);
        }
        int c=0;
        for(Map.Entry<Character, Set<Character>> hm : mp.entrySet()){
            Character key = hm.getKey();
            Set<Character> s= hm.getValue();
            System.out.print(key+":");
            for(Character a: s){
                System.out.print(" "+a);
            }
            System.out.println();
            if(s.size()==3) c++;
        }
//        for(int i=0;i<9;i++){
//            if(mp.containsKey(i) && mp.get(i).size()==3) c++;
//        }
        return c;
    }

    public static void main(String[] args) {
        System.out.println(countPoints("B0B6G0R6R0R6G9"));
    }
}
