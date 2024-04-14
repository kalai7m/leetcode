package HashmapPkg;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.PriorityQueue;

//https://leetcode.com/explore/learn/card/hash-table/187/conclusion-hash-table/1133/
public class TopKFrequencyEle {
    static  int[] topKFrequent(int[] nums, int k) {
        Map<Integer,Integer> mp = new HashMap<>();
        for(int i:nums) {
            mp.put(i,mp.getOrDefault(i,0)+1);
        }
        PriorityQueue<Integer> pq= new PriorityQueue<>((a,b)->mp.get(b)-mp.get(a));
        pq.addAll(mp.keySet());
        int res[] = new int[k];
        int i=0;
        for(;i<k;i++){
            res[i]=pq.poll();
        }
        return res;
    }
    public static void main(String[] args) {
        int a[] = new int[]{1, 1, 1, 2, 2, 3}, k = 2;
        int res[]=topKFrequent(a,k);
        System.out.println(Arrays.toString(res));
    }
}
