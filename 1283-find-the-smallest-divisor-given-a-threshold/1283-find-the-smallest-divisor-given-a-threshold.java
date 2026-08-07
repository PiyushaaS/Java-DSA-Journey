class Solution {
    public int smallestDivisor(int[] nums, int threshold) {
        int low = 1;
        int high = 0;
        for (int num : nums) {
            high = Math.max(high, num);
        }
        while (low <= high) {
            int mid = low + (high - low) / 2;
            if (isPossible(nums, mid, threshold)) {
                high = mid - 1;
            } else {
                low = mid + 1;
            }
        }
        return low;
    }

    public boolean isPossible(int[] nums, int number, int limit) {
        int total = 0;
        for (int num : nums) {
            total += (num + number - 1) / number;
            if (total > limit) {
                return false;
            }
        }
        return true;
    }
}