package linear;

/**
 * 计数排序
 */
public class CountingSort {

    public static void main(String[] args) {
        int[] arr = {4, 2, 7, 3, 6, 1, 5,3};
        sort(arr);
        for (int i : arr) {
            System.out.println(i);
        }


    }


    private static void sort(int[] a) {
        int max = a[0];
        for (int i = 0; i < a.length; i++) {
            if (a[i] > max)
                max = a[i];
        }

        int[] c = new int[max + 1];
        for (int i = 0; i < a.length; i++) {
            c[a[i]]++;
        }

        for (int i = 1; i < c.length; i++) {
            c[i] = c[i - 1] + c[i];
        }

        int[] tmp = new int[a.length];
        /**
         * 从末尾开始循环可以构成稳定排序
         */
        for (int i = a.length - 1; i >= 0; i--) {
            tmp[c[a[i]] - 1] = a[i];
            c[a[i]]--;
        }

        for (int i = tmp.length - 1; i >= 0; i--) {
            a[i] = tmp[i];
        }
    }
}
