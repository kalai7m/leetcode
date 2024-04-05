package Arrays;
//https://leetcode.com/problems/create-target-array-in-the-given-order/
//https://leetcode.com/problems/create-target-array-in-the-given-order/solutions/4976336/beats-100-of-users-with-java
//https://leetcode.com/problems/create-target-array-in-the-given-order/solutions/4976413/beats-100-of-users-with-java-o-1-space-complexity
import java.util.Arrays;

public class CreateTargetArray {
    static int[] createTargetArray(int[] nums, int[] index) {
        int n = nums.length;
        int res[] = new int[n];
        Arrays.fill(res, -1);
        for(int i=0; i < n; i++) {
            if(res[index[i]] != -1) {
                int j = i-1;
                while(j>=index[i]) {
                    res[j + 1] = res[j];
                    j--;
                }
            }
            res[index[i]] = nums[i];
        }
        return res;
    }

    public static void main(String[] args) {
        int nums[] = new int[]{0,1,2,3,4}, index[] = new int[]{0,1,2,2,1};
        System.out.println(Arrays.toString(createTargetArray(nums,index)));
    }
}
