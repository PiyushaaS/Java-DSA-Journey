import java.util.*;
import java.util.Arrays;

class Solution {
    public int[] intersectionArray(int[] nums1, int[] nums2) {
        ArrayList<Integer> list = new ArrayList<>();
        int i = 0;
        int j = 0;
        while (i < nums1.length && j < nums2.length) {
            if (nums1[i] < nums2[j]) {
                i++;
            } else if (nums2[j] < nums1[i]) {
                j++;
            } else {
                if (list.isEmpty() || list.get(list.size() - 1) != nums1[i]) {
                    list.add(nums1[i]);
                }
                i++;
                j++;
            }
        }
        int[] intersection = new int[list.size()];
        for (int k = 0; k < list.size(); k++) {
            intersection[k] = list.get(k);
        }
        return intersection;
    }

    public static void main(String[] args) {
        int[] nums1 = { 1, 2, 3, 4 };
        int[] nums2 = { 2, 5, 6 };
        Solution obj = new Solution();
        System.out.print(Arrays.toString(obj.intersectionArray(nums1, nums2)));
    }
}
