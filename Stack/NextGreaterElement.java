package Stack;

import java.util.HashMap;
import java.util.Stack;

public class NextGreaterElement {
    static int[] nextGreaterElement(int[] nums1, int[] nums2) {
        HashMap<Integer,Integer> mp=new HashMap<Integer, Integer>();
        int [] res = new int[nums1.length];
        Stack<Integer> s=new Stack<Integer>();
        for(int i=0;i< nums1.length;i++) {
            mp.put(nums1[i],i);
        }
        for(int i=0;i< nums2.length;i++){
            while (!s.isEmpty() && s.peek()<nums2[i]){
                int j=s.pop();
                res[mp.get(j)] = nums2[i];
            }
            if(mp.containsKey(nums2[i])) s.push(nums2[i]);
        }
        while (!s.isEmpty()){
            int j=s.pop();
            res[mp.get(j)] = -1;
        }
        return res;
    }
    public static void main(String[] args) {
        int []n1 = new int[]{4,1,2};
        int []n2 = new int[]{1,3,4,2};
        int []res = nextGreaterElement(n1,n2);
        for(int i: res){
            System.out.println(i);
        }
    }
}
