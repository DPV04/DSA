package arrays;

public class longestsubsequence {

    public static void main(String[] args) {
        int[] arr = {3, 3, 1, 1, 3, 4, 6, 7};
        int k = 5;
        int result = sublength(arr, k);
        System.out.println(result);
    }

    public static int sublength(int[] arr, int k) {
        int r = 0;
        int l = 0;
        int sum = arr[0];
        int maxlen = 0;
        int n = arr.length;

        while (r < n) {
            r++;
            if (r < n) {
                sum += arr[r];
            }
            if (sum == k) {
                int len = r - l + 1;
                maxlen = Math.max(maxlen, len);
            }
            while (sum > k && l <= r) {
                sum -= arr[l];
                l++;
            }

        }
        return maxlen;
    }
}
