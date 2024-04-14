package Arrays;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

//https://leetcode.com/problems/decompress-run-length-encoded-list/description/
public class DecompressRunLengthEncodedList {
    static int[] decompressRLElist(int[] nums) {
        List<Integer> encodedL = new ArrayList<Integer>();
        for(int i=0;i<nums.length;i+=2){
            for(int j=0;j<nums[i];j++){
                encodedL.add(nums[i+1]);
            }
        }
        int res[]=new int[encodedL.size()];
        for(int i=0;i<res.length;i++){
            res[i]=encodedL.get(i);
        }
        return res;
    }
    public static void main(String[] args) {
        int a[]=new int[]{1,2,3,4};
        int res[]=decompressRLElist(a);
        System.out.println(Arrays.toString(res));
    }
}
