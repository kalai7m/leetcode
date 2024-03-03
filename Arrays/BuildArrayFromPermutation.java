package Arrays;

import java.util.Arrays;

public class BuildArrayFromPermutation {
    static int[] buildArray(int[] nums) {
        int [] a= new int[nums.length];
        for(int i=0;i<nums.length;i++) {
            a[i]=nums[nums[i]];
        }
        return a;
    }

    public static void main(String[] args) {
        System.out.println(Arrays.toString(buildArray(new int[]{0,2,1,5,3,4})));
    }
}

//Time complexity  O(n)  Traverse all elements in an array
//Space complexity O(n)  size of original array