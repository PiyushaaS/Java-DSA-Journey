class Solution {
    public int minimizedMaximum(int n, int[] quantities) {
        int low = 1;
        int high = 0;
        for (int quantity : quantities) {
            high = Math.max(high, quantity);
        }
        while (low < high) {
            int mid = low + (high - low) / 2;
            if (isPossible(quantities, mid, n)) {
                high = mid;
            } else {
                low = mid + 1;
            }
        }
        return high;
    }

    public boolean isPossible(int[] quantities, int x, int n) {
        int store = 0;
        for (int quantity : quantities) {
            store += (quantity + x - 1) / x;
            if (store > n) {
                return false;
            }
        }
        return true;
    }
}