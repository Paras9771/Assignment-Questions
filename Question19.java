public class Question19 {
    public static int maxProduct(int[] nums) {
        int currMax = nums[0];
        int currMin = nums[0];
        int maxProduct = nums[0];
        for (int i = 1; i < nums.length; i++) {
            int temp = currMax;
            if (nums[i] < 0) {
                currMax = currMin;
                currMin = temp;
            }
            currMax = Math.max(nums[i], nums[i] * currMax);
            currMin = Math.min(nums[i], nums[i] * currMin);

            maxProduct = Math.max(maxProduct, currMax);
        }
        return maxProduct;
    }
    public static void main(String[] args) {
        int[] nums = {2, 3, -2, 4};
        System.out.println("Maximum Product Subarray: " + maxProduct(nums)); // Output: 6
    }
}
