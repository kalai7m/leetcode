package Arrays;
/*
1929. Concatenation of Array
https://leetcode.com/problems/concatenation-of-array/description/
https://github.com/kalai7m/leetcode.git
* */
public class ConcatenationOfArrays {
    public int[] getConcatenation(int[] nums) {
        int n=nums.length;
        int[] a = new int[2*n];
        for(int i=0;i<n;i++){
            a[i]=nums[i];
            a[i+n]=nums[i];
        }
        return a;
    }
    public static void main(String[] args) {
        ConcatenationOfArrays obj = new ConcatenationOfArrays();
        int nums[] = new int[]{1,2,1};
        int a[] = obj.getConcatenation(nums);
        for (int i =0;i<a.length;i++) {
            System.out.print(a[i]+", ");
        }
    }
}

//Time complexity  O(n)  Traverse all elements in an array
//Space complexity O(n)  2*size of original array
