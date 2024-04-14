package Arrays;
//https://leetcode.com/problems/maximum-prime-difference/
import java.util.Arrays;

public class MaximumPrimeDifference {

    public static void main(String[] args) {
//        int nums[] = new int[]{4,2,9,5,3};
        int nums[] = new int[]{1,7};
        System.out.println(maximumPrimeDifference(nums));
    }
    static boolean[] getPrime(){
        boolean prime[] = new boolean[101];
        Arrays.fill(prime,true);
        prime[0] = prime[1] = false;
        for(int i=2; i*i <=100 ; i++) {
            if(prime[i] == true){
                for(int j=i*i; j<=100; j+=i) {
                    prime[j] = false;
                }
            }
        }
        return prime;
    }
    static int maximumPrimeDifference(int[] nums) {
        boolean prime[] = getPrime();
//        System.out.println(prime);
        int l=0, r=nums.length-1;
        int max=0;
        while(l<r){
            if(prime[nums[l]] == true && prime[nums[r]] == true){
                max = Math.max(r-l, max); break;
            } else if(prime[nums[l]] != true) {
                l++;
            } else if(prime[nums[r]] != true) {
                r--;
            }
        }
        return max;
    }
}
