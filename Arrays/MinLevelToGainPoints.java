package Arrays;
//https://leetcode.com/problems/minimum-levels-to-gain-more-points/description/
import java.util.Arrays;

public class MinLevelToGainPoints {
    static int cal(int start, int end, int[] pos) {
        int s = 0;
        while (start <= end) {
            s = s+ ((pos[start++] == 1) ? 1 : -1);
        }
        return s;
    }

    static int minimumLevels(int[] pos) {
        int n = pos.length;
        int res=Integer.MAX_VALUE;
        int score[] = new int[n];
        int score1[] = new int[n];
        score[0] =cal(0, 0, pos);
        score1[0] = cal(1, n - 1, pos);
        if(score[0]>score1[0]) res = 1;
        for (int i = 1; i < n - 1; i++) {
            int a = (pos[i]==1)?1:-1;
            score[i] = score[i-1] + a;
            score1[i] = score1[i-1] - a;
            if(score[i]>score1[i]) res = Math.min(res,i+1);
            System.out.println(score[i]+" "+score1[i]+" "+res);
        }
        System.out.println(Arrays.toString(score));
        System.out.println(Arrays.toString(score1));
        return res != Integer.MAX_VALUE ? res : -1;
    }

    public static void main(String[] args) {
        System.out.println(minimumLevels(new int[]{0,0}));
    }
}
