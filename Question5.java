public class Question5 {
    public static int maxSum(int[] arr, int k) {
        int maxSum = 0, windowSum = 0;
        for (int i = 0; i < k; i++) {
            windowSum += arr[i];
        }
        maxSum = windowSum;
        for (int i = k; i < arr.length; i++) {
            windowSum += arr[i] - arr[i - k];
            maxSum = Math.max(maxSum, windowSum);
        }
        return maxSum;
    }
    public static void main(String[] args) {
        int[] arr = {2, 1, 5, 1, 3, 2};
        int k = 3;
        System.out.println("maximum sum of the subarray of size " + k + " is: ");
        System.out.println( maxSum(arr, k));
    }
}
