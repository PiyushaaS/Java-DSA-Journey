import java.util.Arrays;

class Solution {
    public int[] nextPermutation(int[] nums) {
        int index = -1;
        int n = nums.length;
        for (int i = n - 2; i >= 0; i--) {
            if (nums[i] < nums[i + 1]) {
                index = i;
                break;
            }
        }
        if (index == -1) {
            reverseArray(nums, 0, n - 1);
            return nums;
        }
        for (int j = n - 1; j > index; j--) {
            if (nums[j] > nums[index]) {
                int temp = nums[index];
                nums[index] = nums[j];
                nums[j] = temp;
                break;
            }
        }
        reverseArray(nums, index + 1, n - 1);
        return nums;
    }

    public void reverseArray(int[] nums, int left, int right) {
        while (left < right) {
            int temp = nums[left];
            nums[left] = nums[right];
            nums[right] = temp;
            left++;
            right--;
        }
    }

    public static void main(String[] args) {
        int[] nums = { 3, 2, 1 };
        Solution obj = new Solution();
        System.out.print(Arrays.toString(obj.nextPermutation(nums)));
    }
}