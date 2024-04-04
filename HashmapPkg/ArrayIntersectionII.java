package HashmapPkg;
//https://leetcode.com/explore/learn/card/hash-table/184/comparison-with-other-data-structures/1178/

import java.util.ArrayList;
import java.util.HashMap;

public class ArrayIntersectionII {
    static int[] intersect(int[] nums1, int[] nums2) {
        HashMap<Integer, Integer> hm = new HashMap<>();
        ArrayList<Integer> res=new ArrayList<>();
        if(nums1.length < nums2.length) return intersect(nums2,nums1);
        for(int i: nums1) {
            hm.put(i, hm.getOrDefault(i,1)+1);
        }
        for(int i:nums2){
            if(hm.containsKey(i) && hm.get(i)!=0){
                hm.put(i, hm.get(i)-1);
                res.add(i);
            }
        }
        int []an = new int[res.size()]; int ind=0;
        for(int i: res){
            an[ind++]=i;
        }
        return an;
    }
    public static void main(String[] args) {
        int [] a = intersect(new int[]{1,2,2,1}, new int[]{2,2});
        for(int i: a){
            System.out.print(i+", ");
        }
    }
}
