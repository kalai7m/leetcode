package Arrays.SumCollection;

import java.util.*;

public class FourSum {
    static List<List<Integer>> fourSum(int[] nums, int target) {
        List<List<Integer>> res = new ArrayList<>();
        Set<List<Integer>> set = new HashSet<>();
        Arrays.sort(nums);
        int n = nums.length;
        for(int i=0;i<n;i++){
            for(int j=i+1;j<n;j++){
                int l=j+1, r=n-1;
                while (l<r){
                    long s = (long) nums[i]+nums[j]+nums[l]+nums[r];
                    System.out.println(s+" "+target);
                    if(s==target){
                        set.add(Arrays.asList(nums[i],nums[j],nums[l],nums[r]));
                        l++;
                        r--;
                    } else if(s<target) l++;
                    else r--;
                }
            }
        }
        res.addAll(set);
        return res;
    }

    public static void main(String[] args) {
        int a[] = new int[]{1000000000,1000000000,1000000000,1000000000}, target = -294967296;
        List<List<Integer>> res = fourSum(a, target);
        System.out.println(res.toString());
    }
}
