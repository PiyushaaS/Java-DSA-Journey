import java.util.*;
class Solution {
    public int[] rearrangeArray(int[] nums) {
        int n = nums.length;
        ArrayList<Integer> pos = new ArrayList<>();
        ArrayList<Integer> neg = new ArrayList<>();
        //Separate positives and negatives
        for (int i = 0; i < n; i++) {
            if (nums[i] < 0) {
                neg.add(nums[i]);
            } else {
                pos.add(nums[i]);
            }
        }
        //Fill alternately
        int i = 0;
        while (i < pos.size() && i < neg.size()) {
            nums[2 * i] = pos.get(i);
            nums[2 * i + 1] = neg.get(i);
            i++;
        }
        //Fill remaining elements
        int index = 2 * i;

        while (i < pos.size()) {
            nums[index++] = pos.get(i++);
        }

        while (i < neg.size()) {
            nums[index++] = neg.get(i++);
        }

        return nums;
    }
    public static void main(String[] args) {
        int[] nums = {2, 4, 5, -1, 3, -4};
        Solution obj = new Solution();
        System.out.println(Arrays.toString(obj.rearrangeArray(nums)));
    }
}