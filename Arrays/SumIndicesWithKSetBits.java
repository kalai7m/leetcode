package Arrays;

import java.util.ArrayList;
import java.util.List;

public class SumIndicesWithKSetBits {
    static int sumIndicesWithKSetBits(List<Integer> nums, int k) {
        int s=0;
        for(int n: nums) {
            System.out.println(n+": "+Integer.bitCount(n));
            if(Integer.bitCount(n)==k) s+=n;
        }
        return s;
    }
    public static void main(String[] args) {
        List<Integer> n = new ArrayList<>();
        n.add(5);
        n.add(10);
        n.add(1);
        n.add(5);
        n.add(2);
        System.out.println(sumIndicesWithKSetBits(n,1));
    }
}
