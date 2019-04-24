package linear;

/**
 * 基数排序
 * 假设我们有 10 万个手机号码，希望将这 10 万个手机号码从小到大排序
 */
public class RadixSort {

    public static void main(String[] args) {
        String[] arr = createPhoneNum(100);
        int len = arr.length;
        for (int i = 10; i >= 0; i--) {
            int[] single = new int[len];
            for (int j = 0; j < len; j++) {
                single[j] = Integer.valueOf(arr[j].substring(i,i+1));
            }

            int[] s = new int[10];
            for (int j = 0; j < single.length; j++) {
                s[single[j]]++;
            }

            for (int j = 1; j < s.length; j++) {
                s[j] = s[j] + s[j - 1];
            }

            String[] tmp = new String[len];
            for (int j = single.length - 1; j >= 0; j--) {
                tmp[s[single[j]] - 1] = arr[j];
                s[single[j]]--;
            }

            for (int j = 0; j < tmp.length; j++) {
                arr[j] = tmp[j];
            }
        }
        StringBuilder builder = new StringBuilder();
        for (String s : arr) {
            builder.append(s + "\n");
        }
        FileUtils.writeTxtToFile(builder.toString(), "d:/test", "sort.txt");
    }


    private static String[] createPhoneNum(int n) {
        StringBuilder builder = new StringBuilder();
        String[] arr = new String[n];
        int i = 0;
        for (; i < n; i++) {
            String p = getPhone();
            arr[i] = p;
            builder.append(p + "\n");
        }

        FileUtils.writeTxtToFile(builder.toString(), "d:/test", "phone.txt");
        return arr;
    }

    private static String[] phoneFirst = "134,135,136,137,138,139,150,151,152,157,158,159,130,131,132,155,156,133,153".split(",");

    private static String getPhone() {
        int index = getNum(0, phoneFirst.length - 1);
        String first = phoneFirst[index];
        String second = String.valueOf(getNum(1, 888) + 10000).substring(1);
        String third = String.valueOf(getNum(1, 9100) + 10000).substring(1);
        return first + second + third;
    }

    public static int getNum(int start, int end) {
        return (int) (Math.random() * (end - start + 1) + start);
    }

}
