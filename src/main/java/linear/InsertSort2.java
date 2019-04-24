package linear;

/**
 * 插入排序
 */
public class InsertSort2 {

    public static void main(String[] args) {
        int[] arr = {4, 2, 7, 3, 6, 1, 5};

        for (int i = 1; i < arr.length; i++) {
            int e = arr[i];
            int j = i - 1;
            for (; j >= 0; j--) {
                if (arr[j] > e) {
                    arr[j + 1] = arr[j];
                } else {
                    break;
                }
            }
            arr[j + 1] = e;
        }
        for (int i : arr) {
            System.out.println(i);
        }
    }
}
