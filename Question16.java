public class Question16 {
    public static int updateCount(int count, int num, int candidate) {
        return (num == candidate) ? count + 1 : count - 1;
    }
    public static int majorityElement(int[] nums) {
        int count = 0, candidate = -1;
        for (int i = 0; i < nums.length; i++) {
            if (count == 0) {
                candidate = nums[i];
            }
            count = updateCount(count, nums[i], candidate);
        }
        return candidate;
    }
    public static void main(String[] args) {
        int[] nums = {3, 2, 3};
        System.out.println("Majority Element: " + majorityElement(nums));
    }
}
