package Arrays;

import java.util.Arrays;
import java.util.Comparator;

//1637. Widest Vertical Area Between Two Points Containing No Points
public class WidestVerticalAreaBetweenPoints {
    static int maxWidthOfVerticalArea(int[][] points) {
        if(points.length<=1) return points.length;
        Arrays.sort(points, new Comparator<int[]>(){
            public int compare(int[] a, int[] b) {
                if(a[0]<b[0]) return 1;
                else return -1;
            }
        });
        int maxwidth=0;
        for(int i=1;i< points.length;i++) {
            maxwidth = Math.max(maxwidth, points[i-1][0]-points[i][0]);
        }
        return maxwidth;
    }
    public static void main(String[] args) {
        int [][] points = {{9,7},{8,7},{7,4},{9,9}};
        System.out.println(maxWidthOfVerticalArea(points));
    }
}
