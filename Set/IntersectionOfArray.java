package Set;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class IntersectionOfArray {
    static int[] intersection(int[] nums1, int[] nums2) {
        Set<Integer> s = new HashSet<>();
        Set<Integer> s1 = new HashSet<>();
        for(int i: nums1){
            s.add(i);
        }
        for(int i: nums2){
            s1.add(i);
        }
        s.retainAll(s1);
        int res[]=new int[s.size()];
        int j=0;
        for(int i: s){
            res[j++]=i;
        }
        return res;
    }
    public static void main(String[] args) {
        int a[]={1,2,3,4}, b[]={1,2,3};
        int c[]=intersection(a,b);
        for(int i:c)
        System.out.print(i+", ");
    }
}
