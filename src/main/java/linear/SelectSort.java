package linear;

public class SelectSort {

    public static void main(String[] args) {
        int[] arr = {4, 2, 7, 3, 6, 1, 5};

        for (int i = 0; i < arr.length - 1; i++) {
            int min = i;
            for (int j = min + 1; j < arr.length; j++) {
                if (arr[j] < arr[min]) {
                    min = j;
                }
            }

            if (min != i) {
                int tmp = arr[min];
                arr[min] = arr[i];
                arr[i] = tmp;
            }
        }

        for (int i : arr) {
            System.out.println(i);
        }
    }
}
