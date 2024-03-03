package Arrays;

public class GoodPairs {
    public int numIdenticalPairs(int[] nums) {
        int res=0;
        if(nums.length < 2) return res;
        else if(nums.length==2){
            res = nums[0]==nums[1] ? 1:0;
            return res;
        }
        int[] map=new int[101];
        for(int i=0;i<101;i++) map[i]=0;
        for(int i=0;i<nums.length;i++) {
            map[nums[i]]=map[nums[i]]+1;
        }
        for(int i=0;i<101;i++) System.out.print(map[i]+", ");
        System.out.println();
        for(int i=0;i<101;i++){
            if(map[i]>1) {
                res=res+((map[i]*(map[i]-1))/2);
            }
        }
        return res;
    }
    public static void main(String[] args) {
        GoodPairs obj = new GoodPairs();
        int nums[] = new int[]{1,2,3,1,1,3};
        int n = obj.numIdenticalPairs(nums);
            System.out.print(n+", ");

    }
}

//Time complexity  O(n)  Traverse all elements in an array
//Space complexity O(1)  size of original array