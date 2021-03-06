package linear;

/**
 * 算法：选择排序
 * 数据结构：线性表结构，数组
 */
public class SelectSort2 {

    public static void main(String[] args) {
        int[] arr = {4, 2, 7, 3, 6, 1, 5};

        for (int i = 0; i < arr.length - 1; i++) {
            int min = i;
            for (int j = i+1; j < arr.length; j++) {
                if (arr[j] < arr[min]) {
                    min = j;
                }
            }
            if (min != i) {
                int tmp = arr[i];
                arr[i] = arr[min];
                arr[min] = tmp;
            }
        }

        for (int i : arr) {
            System.out.println(i);
        }
    }
}
