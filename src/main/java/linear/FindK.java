package linear;

/**
 * 寻找第K大元素
 */
public class FindK {

    public static void main(String[] args) {
        int[] arr = {4, 2, 5, 12, 3, 26, 13, 5, 7};
        int k = 4;
        findK(arr, 0, arr.length - 1, k);
        System.out.println("K===" + arr[k - 1]);
    }

    private static int findK(int[] a, int start, int end, int k) {
        if (start >= end) return -1;
        int p = findP(a, start, end);
        System.out.println("p>>>" + p);
        for (int i : a) {
            System.out.print(i + " ");
        }
        System.out.println();
        if (k - 1 > p) {
            findK(a, p + 1, end, k);
        } else if (k - 1 < p) {
            findK(a, start, p - 1, k);
        } else {
            return p;
        }
        return -1;
    }

    private static int findP(int[] a, int start, int end) {
        int p = end;
        int key = start;
        for (int i = start; i <= end - 1; i++) {
            if (a[i] > a[p]) {
                int tmp = a[key];
                a[key++] = a[i];
                a[i] = tmp;
            }
        }
        int t = a[key];
        a[key] = a[p];
        a[p] = t;
        return key;
    }
}
