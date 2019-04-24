package linear;

/**
 * 数据结构：数组
 * 算法：快排
 */
public class QuickSort {

    public static void main(String[] args) {
        int[] arr = {4, 2, 7, 3, 6, 1, 5};
        quickSort(arr, 0, arr.length - 1);
        for (int i : arr) {
            System.out.println(i);
        }
    }

    private static void quickSort(int[] a, int start, int end) {
        if (start >= end) return;
        int p = findP(a, start, end);
        quickSort(a, start, p - 1);
        quickSort(a, p + 1, end);
    }

    private static int findP(int a[], int start, int end) {
        int p = end;
        int key = start;
        for (int i = start; i <=end-1; i++) {
            if (a[i] < a[p]) {
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
