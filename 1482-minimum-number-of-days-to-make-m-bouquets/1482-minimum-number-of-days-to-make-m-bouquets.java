class Solution {
    public int minDays(int[] bloomDay, int m, int k) {
        int n = bloomDay.length;
        if (n < (long) m * k) {
            return -1;
        }
        int low = bloomDay[0];
        int high = 0;
        for (int day : bloomDay) {
            low = Math.min(low, day);
            high = Math.max(high, day);
        }
        while (low <= high) {
            int mid = low + (high - low) / 2;
            if (isPossible(bloomDay, mid, m, k)) {
                high = mid - 1;
            } else {
                low = mid + 1;
            }
        }
        return low;
    }

    public boolean isPossible(int[] bloomDay, int day, int m, int k) {
        int bouquets = 0;
        int flowers = 0;
        for (int bloom : bloomDay) {
            if (bloom <= day) {
                flowers++;
                if (flowers == k) {
                    bouquets++;
                    flowers = 0;

                    if (bouquets >= m) {
                        return true;
                    }
                }
            } else {
                flowers = 0;
            }
        }
        return false;
    }
}