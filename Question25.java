public class Question25 {

    public static void main(String[] args) {
        int[] nums = {4, 5, 2, 10, 8};
        int n = nums.length;
        int[] result = new int[n];

        for (int i = 0; i < n; i++) {
            result[i] = -1; // default -1
            for (int j = i + 1; j < n; j++) {
                if (nums[j] > nums[i]) {
                    result[i] = nums[j];
                    break;
                }
            }
        }
        System.out.print("Next Greater Elements: ");
        for (int val : result) {
            System.out.print(val + " ");
        }
    }
}
