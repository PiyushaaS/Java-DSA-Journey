class Solution {
    public int trap(int[] height) {
        int n = height.length;
        int left = 0;
        int right = n - 1;
        int lmax = height[0];
        int rmax = height[n - 1];
        int total = 0;
        while (left < right) {
            lmax = Math.max(lmax, height[left]);
            rmax = Math.max(rmax, height[right]);
            if (height[left] <= height[right]) {
                if (lmax > height[left]) {
                    total += (lmax - height[left]);
                }
                left++;
            } else {
                if (rmax > height[right]) {
                    total += (rmax - height[right]);
                }
                right--;
            }
        }
        return total;
    }
}