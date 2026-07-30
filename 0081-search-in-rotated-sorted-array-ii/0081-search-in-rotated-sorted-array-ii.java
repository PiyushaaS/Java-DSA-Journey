class Solution {
    public boolean search(int[] nums, int target) {
        int n = nums.length;
        int low = 0;
        int high = n - 1;
        while (low <= high) {
            int mid = low + (high - low) / 2;
            if (nums[mid] == target) {
                return true;
            }
            if (nums[low] == nums[mid] && nums[mid] == nums[high]) {
                low++;
                high--;
            }
            //left sorted
            else if (nums[low] <= nums[mid]) {
                //if in the left, then eliminate the right half
                if (nums[low] <= target && nums[mid] > target) {
                    high = mid - 1;
                }
                //if not, eliminate the left half 
                else {
                    low = mid + 1;
                }
            }
            //right sorted
            else {
                //if in right, eliminate left half
                if (nums[high] >= target && nums[mid] < target) {
                    low = mid + 1;
                }
                //else eliminate right half 
                else {
                    high = mid - 1;
                }
            }
        }
        return false;
    }
}