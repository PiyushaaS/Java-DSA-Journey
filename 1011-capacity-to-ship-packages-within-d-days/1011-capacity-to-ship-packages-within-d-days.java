class Solution {
    public int shipWithinDays(int[] weights, int days) {
        int low = weights[0];
        int high = 0;
        for (int weight : weights) {
            low = Math.max(low, weight);
            high += weight;

        }
        while (low <= high) {
            int mid = low + (high - low) / 2;
            if (isPossible(weights, mid, days)) {
                high = mid - 1;
            } else {
                low = mid + 1;
            }
        }
        return low;
    }

    public boolean isPossible(int[] weights, int capacity, int limit) {
        int total = 0;
        int days = 1;
        for (int weight : weights) {
            total += weight;
            if (total > capacity) {
                days++;
                total = weight;
            }
            if (days > limit) {
                return false;
            }
        }
        return true;
    }
}