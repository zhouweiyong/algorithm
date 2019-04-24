package linear;

/**
 * 归并排序
 * https://blog.csdn.net/qq_36442947/article/details/81612870
 */
public class MergeSort {

    public static void main(String[] args) {
        int[] arr = {4, 2, 3, 6, 1, 5};
        mergeSort(arr, 0, arr.length - 1);
        for (int i : arr) {
            System.out.println(i);
        }

    }

    private static void mergeSort(int[] a, int start, int end) {
        if (start < end) {
            int mid = (start + end) / 2;
            mergeSort(a, start, mid);
            mergeSort(a, mid + 1, end);
            merge(a, start, mid, end);
        }
    }

    private static void merge(int[] a, int left, int mid, int right) {
        int p1 = left;
        int p2 = mid + 1;
        int k = left;
        int[] tmp = new int[a.length];

        while (p1 <= mid && p2 <= right) {
            if (a[p1] < a[p2]) {
                tmp[k++] = a[p1++];
            } else {
                tmp[k++] = a[p2++];
            }
        }

        while (p1 <= mid)
            tmp[k++] = a[p1++];
        while (p2 <= right)
            tmp[k++] = a[p2++];

        for (int i = left; i <= right; i++) {
            a[i] = tmp[i];
        }
    }
}
