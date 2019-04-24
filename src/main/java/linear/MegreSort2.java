package linear;

/**
 * 算法：归并排序
 * 数据结构：数组
 */
public class MegreSort2 {

    public static void main(String[] args) {
        int[] arr = {4, 2, 7, 3, 6, 1, 5};

        megreSort(arr, 0, arr.length - 1);
        for (int i : arr) {
            System.out.println(i);
        }
    }

    private static void megreSort(int[] a, int start, int end) {
        if (start >= end) return;
        int mid = (start + end) / 2;
        megreSort(a, start, mid);
        megreSort(a, mid + 1, end);
        megre(a, start, mid, end);
    }

    private static void megre(int[] a, int start, int mid, int end) {
        int[] tmp = new int[a.length];
        int i = start;
        int j = mid + 1;
        int k = start;
        while (i <= mid && j <= end) {
            if (a[i] <= a[j]) {
                tmp[k++] = a[i++];
            } else {
                tmp[k++] = a[j++];
            }
        }
        while (i <= mid) tmp[k++] = a[i++];
        while (j <= end) tmp[k++] = a[j++];
        for (int key = start; key <= end; key++) {
            a[key] = tmp[key];
        }
    }
}
