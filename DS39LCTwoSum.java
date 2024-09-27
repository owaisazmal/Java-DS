
public class DS39LCTwoSum {
    public static void main(String[] args) {
        int nums[] = {3,6,7,8};
        twoSum(nums, 7);
    } 
    public static  int[] twoSum(int[] nums, int target) {
        int n = nums.length;
        for (int i = 0; i < n - 1; i++) {
            for (int j = i + 1; j < n; j++) {
                if (nums[i] + nums[j] == target) {
                    return new int[]{i, j};
                }
            }
        }
        return new int[]{}; // No solution found
    }
}
