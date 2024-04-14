package Arrays.QuickSelect;
//https://leetcode.com/problems/top-k-frequent-elements/description/

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class TopKFreqElements {
    public Map<Integer, Integer> mp = new HashMap<>();
    public int[] unique;

    public static void main(String[] args) {
        TopKFreqElements obj = new TopKFreqElements();
        int a[] = new int[]{7, 7, 10, 10, 10, 10, 10, 3, 3, 3, 3, 3, 3, 9, 9, 4, 2, 2, 2, 2};
        int k = 10;
        int res[] = obj.topKFrequent(a, k);
        System.out.println("Top " + k + " Freq Ele: " + Arrays.toString(res));
    }

    public int[] topKFrequent(int[] a, int k) {
        for (int i = 0; i < a.length; i++) {
            mp.put(a[i], mp.getOrDefault(a[i], 0) + 1);
        }
        int n = mp.size();
        unique = new int[n];
        int j = 0;
        for (int i : mp.keySet()) {
            unique[j++] = i;
        }
        System.out.println("Unique: " + Arrays.toString(unique));
        quickSelect(0, n - 1, n - k);
        return Arrays.copyOfRange(unique, n-k, n);
    }

    public void quickSelect(int l, int r, int k) {
        if (l == r) return;
        int pi = partition(l, r);
        if (pi == k) return;
        else if (pi < k) quickSelect(pi + 1, r, k);
        else quickSelect(l, pi - 1, k);
    }

    public int partition(int l, int r) {
        int pivotFreq = mp.get(unique[r]);
        int i = l - 1;
        for (int j = l; j < r; j++) {
            if (mp.get(unique[j]) < pivotFreq) {
                i++;
                swap(i, j);
            }
        }
        swap(i + 1, r);
        return i + 1;
    }

    public void swap(int x, int y) {
        int t = unique[x];
        unique[x] = unique[y];
        unique[y] = t;
    }
}
