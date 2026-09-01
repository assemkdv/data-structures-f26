public class Review {

    public static void main(String[] args) {

        String x = "13205";

        System.out.println(stringToInt(x));
        System.out.println(log2(300));

        int[] a = {5, 3, 4, 2, 8, 1};

        reverse(a);

        for (int i = 0; i < a.length; i++) {
            System.out.println(a[i]);
        }
    }

    static int stringToInt(String s) {
        if (s.length() == 0) {
            return 0;
        }

        char last = s.charAt(s.length() - 1);
        int digit = last - '0';

        String others = s.substring(0, s.length() - 1);

        return 10 * stringToInt(others) + digit;
    }

    static int log2(int x) {
        if (x == 1) {
            return 0;
        }

        return 1 + log2(x / 2);
    }

    static void reverse(int[] a) {
        reverseRecursive(a, 0, a.length - 1);
    }

    static void reverseRecursive(int[] a, int start, int end) {
        if (start >= end) {
            return;
        }

        swap(a, start, end);
        reverseRecursive(a, start + 1, end - 1);
    }

    static void swap(int[] a, int i, int j) {
        int temp = a[i];
        a[i] = a[j];
        a[j] = temp;
    }
}