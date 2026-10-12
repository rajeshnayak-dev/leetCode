class Solution {
    long totalHour(int[] piles, long speed) {
        long sum = 0;

        for (int n : piles) {
            sum += (n + speed - 1) / speed;
        }

        return sum;
    }

    public int minEatingSpeed(int[] piles, int h) {
        long max = 0;

        for (int n : piles) {
            max = Math.max(max, n);
        }

        long low = 1, high = max;
        long ans = max;

        while (low <= high) {
            long mid = low + (high - low) / 2;
            long hours = totalHour(piles, mid);

            if (hours <= h) {
                ans = mid;
                high = mid - 1;
            } else {
                low = mid + 1;
            }
        }

        return (int) ans;
    }
}