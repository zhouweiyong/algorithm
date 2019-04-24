package linear;

/**
 * 冒泡
 */
public class BubbleSort2 {

    public static void main(String[] args) {
        int[] arr = {4, 2, 7, 3, 6, 1, 5};

        for (int i = 0; i < arr.length - 1; i++) {
            boolean b = true;
            for (int j = 0; j < arr.length - 1 - i; j++) {
                if (arr[j] > arr[j + 1]) {
                    int tmp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = tmp;
                    b = false;
                }
            }
            if (b) break;
        }

        for (int i : arr) {
            System.out.println(i);
        }

    }
}
