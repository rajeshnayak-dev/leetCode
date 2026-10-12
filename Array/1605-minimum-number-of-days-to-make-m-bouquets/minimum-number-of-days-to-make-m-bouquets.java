class Solution {
    public int minDays(int[] bloomDay, int m, int k) {
        if ((long) bloomDay.length < (long) m * k) {
            return -1;
        }

        int min = Integer.MAX_VALUE;
        int max = Integer.MIN_VALUE;

        for (int n : bloomDay) {
            min = Math.min(min, n);
            max = Math.max(max, n);
        }

        int ans = max;

        while (min <= max) {
            int mid = min + (max - min) / 2;

            int bouquets = 0;
            int cnt = 0;

            for (int n : bloomDay) {
                if (n <= mid) {
                    cnt++;

                    if (cnt == k) {
                        bouquets++;
                        cnt = 0;
                    }
                } else {
                    cnt = 0;
                }
            }

            if (bouquets >= m) {
                ans = mid;
                max = mid - 1;
            } else {
                min = mid + 1;
            }
        }

        return ans;
    }
}