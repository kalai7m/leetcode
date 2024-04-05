package Arrays.SumCollection;

import java.util.*;

//https://leetcode.com/problems/3sum/description/
public class ThreeSum {
    static List<List<Integer>> threeSum(int[] nums) {
        List<List<Integer>> res = new ArrayList<>();
        Set<List<Integer>> set = new HashSet<>();
        int n = nums.length;
        Arrays.sort(nums);
        for (int i = 0; i < n; i++) {
            int l=i+1, r = n-1;

            while(l<r){
                int s = nums[i] +nums[l] +nums[r];
                if(s==0){
                    set.add(Arrays.asList(nums[i] ,nums[l] ,nums[r]));
                    l++;
                    r--;
                }else if(s<0) l++;
                else r--;
            }
        }
        res.addAll(set);
        return res;
    }

    public static void main(String[] args) {
        int a[] = new int[]{-1, 0, 1, 2, -1, -4}, target = 0;
        List<List<Integer>> res = threeSum(a);
        System.out.println(res.toString());
    }
}
