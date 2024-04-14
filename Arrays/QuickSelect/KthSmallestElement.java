package Arrays.QuickSelect;
// We are using quickselect with lomuto's algorithm
public class KthSmallestElement {
    public static void main(String[] args) {
        int a[] = new int[]{7, 10, 3, 9, 4, 2};
        System.out.println(getKthSmallElement(a, 2));
    }

    static int getKthSmallElement(int[] a, int k) {
        int n = a.length;
        int kthSmallRes = quickSelect(a, 0, n - 1, k); // kth smallest number
        int kthLargestRes = quickSelect(a, 0, n - 1, n-k); // kth largest number will be in n-k th position
        return kthSmallRes;
    }

    static int quickSelect(int[] a, int l, int r, int k) {
//        if (l == r) return a[l];
        int pi = partition(a, l, r);
        if(pi==k-1) return a[pi];
        else if(pi<k-1) return quickSelect(a,pi+1,r,k);
        else return quickSelect(a,l,pi-1,k);
    }

    static int partition(int[] a, int l, int r) {
        int p = a[r], i = l - 1, j;
        for (j = l; j < r; j++) {
            if (a[j] < p) {
                i++;
                swap(a, i, j);
            }
        }
        swap(a,i+1,r);
        return i+1;
    }

    static void swap(int a[], int i, int j) {
        int t = a[i];
        a[i] = a[j];
        a[j] = t;
    }
}
