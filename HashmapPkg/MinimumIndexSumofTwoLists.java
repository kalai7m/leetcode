package HashmapPkg;

import java.util.*;

public class MinimumIndexSumofTwoLists {
    static String[] findRestaurant(String[] list1, String[] list2) {
        HashMap<String, Integer> mp1 = new HashMap<>();
        HashMap<String, Integer> mp = new HashMap<>();
        LinkedHashMap<String, Integer> lmp = new LinkedHashMap<>();
        ArrayList<Integer> val = new ArrayList<>();
        ArrayList<String> st = new ArrayList<>();
        for(int i=0;i<list1.length;i++) {
            mp1.putIfAbsent(list1[i],i);
        }
        for(int i=0;i<list2.length;i++) {
            if(mp1.containsKey(list2[i])){
                Integer value=mp1.get(list2[i])+i;
                mp.put(list2[i], value);
                val.add(value);
            }
        }
//        for(Map.Entry<String , Integer> e: mp.entrySet()){
//            val.add(e.getValue());
////            System.out.println(e.getKey() + " - " + e.getValue());
//        }
        Collections.sort(val);
        System.out.println("RESULT");
        for(int v: val) {
            for(Map.Entry<String,Integer> e: mp.entrySet()) {
                if (v == e.getValue()) {
                    lmp.put(e.getKey(), v);
                }
            }
        }
        int valF=-1;
        for(Map.Entry<String,Integer> e: lmp.entrySet()) {
//            System.out.println(e.getKey() + " - " + e.getValue());
            if(valF==-1) valF=e.getValue();
            if(valF == e.getValue())
                st.add(e.getKey());
            else break;
        }
        String []res = st.toArray(new String[st.size()]);
        return res;
    }
    public static void main(String[] args) {
        String []l1= new String[]{"happy","sad","good"};
        String []l2= new String[]{"sad","happy","good"};
        String []res = findRestaurant(l1,l2);
        for(String s: res)
            System.out.print(s+", ");
    }
}
