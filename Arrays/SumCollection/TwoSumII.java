package Arrays.SumCollection;

import java.util.Arrays;
import java.util.HashMap;

public class TwoSumII {
    static int[] twoSum(int[] nums, int target) {
        int n = nums.length;
        int res[] = new int[2];
        int l=0,r=nums[n-1];
        while (l<r){
            int s=nums[l]+nums[r];
            if(s==target) {
                nums[0]=l;
                nums[1]=r;
            }
            else if (s<target) l++;
            else r--;
        }
        return res;
    }

    public static void main(String[] args) {
        //input is sorted
        int a[] = new int[]{2, 7, 11, 15}, target = 9;
        int res[] = twoSum(a, target);
        System.out.println(Arrays.toString(res));
    }
}
