import java.util.*;

class Solution {
    public int longestSubArray(int[] nums, int k) {
        HashMap<Integer, Integer> map = new HashMap();
        int sum = 0;
        int length = 0;
        for (int i = 0; i < nums.length; i++) {
            sum += nums[i];
            map.put(sum, i);
            if (sum == k) {
                length = Math.max(length, i + 1);
            }
            if (map.containsKey(sum - k)) {
                int len = i - map.get(sum - k);
                length = Math.max(len, length);
            }
            if (!map.containsKey(sum)) {
                map.put(sum, i);
            }
        }
        return length;
    }

    public static void main(String[] args) {
        int[] nums = { 10, 5, 2, 7, 1, 9 };
        Solution obj = new Solution();
        System.out.print(obj.longestSubArray(nums, 15));
    }
}