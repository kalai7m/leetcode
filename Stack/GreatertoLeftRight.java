package Stack;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Stack;
//    Variation for monotonic stack
//    {5, 3, 1, 2, 4};
//    firstGreaterToLeft: [-1, 5, 3, 3, 5]
//    firstGreaterToRight: [-1, 4, 2, 4, -1]
public class GreatertoLeftRight {
    static void nextGreater(int a[]) {
        int left[] = new int[a.length];
        int right[] = new int[a.length];
        Stack<Integer> s=new Stack<>();
        Arrays.fill(left,-1);
        Arrays.fill(right,-1);
        HashMap<Integer,Integer> mp = new HashMap<>();
        for(int i=0;i<a.length;i++) mp.put(a[i],i);
        for(int i=0; i<a.length; i++) {
            while(!s.empty() && s.peek()<a[i]){
                int v = s.pop();
                right[mp.get(v)] = a[i];
            }
            if(!s.empty()) left[i]=s.peek();
            s.push(a[i]);
        }
        System.out.println(Arrays.toString(left));
        System.out.println(Arrays.toString(right));
    }
    public static void main(String[] args) {
        int a[] = new int[]{5, 3, 1, 2, 4};
        nextGreater(a);
    }
}
