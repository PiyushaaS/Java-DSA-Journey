class Solution {
    public int minEatingSpeed(int[] piles, int h) {
        int low = 1;
        int high = findMax(piles);

        while (low < high) {
            int mid = low + (high - low) / 2;

            if (canFinish(piles, h, mid)) {
                high = mid; // Try a smaller speed
            } else {
                low = mid + 1; // Need a faster speed
            }
        }

        return low;
    }

    private boolean canFinish(int[] piles, int h, int speed) {
        long hours = 0;

        for (int pile : piles) {
            hours += (pile + speed - 1) / speed; // Ceiling division

            // Optimization: stop early if hours already exceed h
            if (hours > h) {
                return false;
            }
        }

        return true;
    }

    private int findMax(int[] piles) {
        int max = piles[0];

        for (int pile : piles) {
            max = Math.max(max, pile);
        }

        return max;
    }
}