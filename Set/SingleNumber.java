package Set;

import java.util.HashSet;
import java.util.Set;

public class SingleNumber {
    static int singleNumber(int[] nums) {
        Set<Integer> s=new HashSet<>();
        for(int i: nums){
             if(s.contains(i)) {
                 s.remove(i);
             }
            else s.add(i);
        }
        return (int)s.toArray()[0];
    }
    public static void main(String[] args) {
        System.out.println(singleNumber(new int[]{4,1,2,1,2}));
    }
}
