package Arrays;
//https://leetcode.com/problems/buy-two-chocolates/
import java.util.Arrays;

public class BuyTwoChocolattes {
//    Solution 1 : O(N^2)
    static int buyChoco(int[] prices, int money) {
        int s = Integer.MAX_VALUE, cursum = 0;
        for (int i = 0; i < prices.length; i++) {
            for (int j = i + 1; j < prices.length; j++) {
                cursum = (prices[i] + prices[j]);
                if (cursum >= 0)
                    s = Math.min(cursum, s);
//                System.out.println(i+","+j+" = "+cursum+" "+s);
            }
        }
        return s <= money ? money-s : money;
    }
    //Solution 2: Sorting O(nlogn)
    int buyChoco1(int[] prices, int money) {
        int s = Integer.MAX_VALUE, cursum = 0;
        Arrays.sort(prices);
        for (int i = 0; i < prices.length - 1; i++) {
            cursum = (prices[i] + prices[i+1]);
            if (cursum >= 0)
                s = Math.min(cursum, s);
        }
        return s <= money ? money-s : money;
    }
    public static void main(String[] args) {
        int a[] = new int[]{98, 54, 6, 34, 66, 63, 52, 39};
        int money = 62;
        System.out.println(buyChoco(a, money));
    }
}
