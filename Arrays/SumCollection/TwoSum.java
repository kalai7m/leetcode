package Arrays.SumCollection;
//https://leetcode.com/problems/two-sum/
import java.util.Arrays;
import java.util.HashMap;

public class TwoSum {
    static int[] twoSum(int[] nums, int target) {
        HashMap<Integer, Integer> mp = new HashMap<>();
        int res[] = new int[2];
        for (int i = 0; i < nums.length; i++) {
            if (mp.containsKey(target - nums[i])) {
                res[0] = mp.get(target - nums[i]);
                res[1] = i;
                break;
            }
            mp.put(nums[i], i);
        }
        return res;
    }

    public static void main(String[] args) {
        int a[] = new int[]{2, 7, 11, 15}, target = 9;
        int res[] = twoSum(a, target);
        System.out.println(Arrays.toString(res));
    }
}
