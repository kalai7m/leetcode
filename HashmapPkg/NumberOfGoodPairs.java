package HashmapPkg;
//https://leetcode.com/problems/number-of-good-pairs/
import java.util.HashMap;

public class NumberOfGoodPairs {
    static int numIdenticalPairs(int[] nums) {
        HashMap<Integer,Integer> mp = new HashMap<>();
        for(int i: nums){
            mp.put(i,mp.getOrDefault(i,0)+1);
        }
        int res=0;
        for(int n: mp.values()){
            res=res+((n*(n-1))/2);
        }
        return res;
    }

    public static void main(String[] args) {
        int a[]=new int[]{1,1,1,1};
        System.out.println(numIdenticalPairs(a));
    }
}
