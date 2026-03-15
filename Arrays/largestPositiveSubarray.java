class Solution {
    public int largestPositiveSubarray(int[] nums, int k) {
        int i = 0;
        int j = 0;
        int sum = 0;
        int Max = 0;
        while (j < nums.length) {
            sum += nums[j];
            while (sum > k) {
                sum -= nums[i];
                i++;
            }
            if (sum == k) {
                Max = Math.max(Max, j - i + 1);
            }
            j++;
        }
        return Max;
    }

    public static void main(String[] args) {
        int[] nums = { 1, 2, 3, 1, 1, 1, 1 };
        Solution obj = new Solution();
        System.out.print(obj.largestPositiveSubarray(nums, 3));
    }
}