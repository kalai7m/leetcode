package Arrays;
//https://leetcode.com/problems/left-and-right-sum-differences/
import java.util.Arrays;

public class LeftRightSumDifferences {
//   APPROACH - 1
//    time - O(n)
//    space - O(1)
    static  int[] leftRightDifference(int[] nums) {
        int lsum = 0, rsum = 0, n = nums.length, temp=0;
        for(int i=n-1;i>0;i--) rsum+=nums[i];
        for(int i=1;i<n;i++){
            temp=nums[i-1];
            nums[i-1] = Math.abs(lsum-rsum);
            lsum+=temp;
            rsum-=nums[i];
        }
        nums[n-1] = Math.abs(lsum-rsum);
        return nums;
    }

//   APPROACH - 2
//    time - O(n)
//    space - O(n)
    static int[] leftRightDifference1(int[] nums) {
        int n = nums.length,sum=0;
        int arr[] = new int[n];
        for(int i = 0 ; i< n;i++){
            sum += nums[i];
        }
        int rightSum = sum;
        int leftSum = 0;
        for(int i = 0 ; i< n;i++){
            rightSum -= nums[i];
//            System.out.println("l="+leftSum+" r="+rightSum+" n["+i+"]="+nums[i]);
            arr[i] = Math.abs(leftSum - rightSum);
            leftSum += nums[i];

            System.out.println(Arrays.toString(arr));
        }
        return arr;
    }
    public static void main(String[] args) {
        int a[] = leftRightDifference(new int[]{10,4,8,3});
        System.out.println(Arrays.toString(a));
    }
}
