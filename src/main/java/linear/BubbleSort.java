package linear;

public class BubbleSort {


    public static void main(String[] args) {
        int[] arr = {4, 2, 3, 6, 1, 5};

        for (int i = 0; i < arr.length - 1; i++) {

            for (int j = 0; j < arr.length - 1 - i; j++) {
                int tmp = arr[j];
                if (arr[j] > arr[j + 1]) {
                    arr[j] = arr[j + 1];
                    arr[j + 1] = tmp;
                }
            }
        }

        for (int i : arr) {
            System.out.println(i);
        }
    }
}
