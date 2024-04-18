package HashmapPkg;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Random;

public class RandomizedSet {
    private HashMap<Integer, Integer> set;
    private List<Integer> list;
    Random random;
    public RandomizedSet() {
        set = new HashMap<>();
        list = new ArrayList<>();
        random = new Random();
    }

    public boolean insert(int val) {
        boolean res = !set.containsKey(val);
        if(res) {
            set.put(val, list.size());
            list.add(val);
        }
        return res;
    }

    public boolean remove(int val) {
        boolean res = set.containsKey(val);
        if(res) {
            int idx = set.get(val);
            int lastIdx = list.size()-1;
            int lastEle = list.get(lastIdx);
            //Use list.set() -> this will update the value in specified index
            // list.add will add new element in that particular index
            list.set(idx, lastEle);
            list.remove(lastIdx);//O(1)
            set.put(lastEle, idx);
            set.remove(val);
        }
        return res;
    }

    public int getRandom() {
        int nextIdx = random.nextInt(list.size());
        return list.get(nextIdx);
    }

    public int getSize() {
        return list.size();
    }

    public void print(){
        System.out.println(list);
    }

    public static void main(String[] args) {
        RandomizedSet obj = new RandomizedSet();
        boolean param_1 = obj.insert(0);
        obj.print();
        boolean param_4 = obj.insert(1);
        obj.print();
        boolean param_2 = obj.remove(0);
        obj.print();
        obj.insert(2);
        obj.print();
        obj.remove(1);
        obj.print();
        int param_3 = obj.getRandom();
        obj.print();
//        System.out.println(param_1);
//        System.out.println(param_2);
//        System.out.println(param_3);
        System.out.println(obj.getSize());
    }
}
