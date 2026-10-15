class Solution {
    public int findKthPositive(int[] arr, int k) {
        int cnt = 0;
        int j = 0;

        for (int i = 1; i <= arr[arr.length - 1] + k; i++) {
            if (j < arr.length && i == arr[j]) {
                j++;
            } else {
                cnt++;
            }

            if (cnt == k) {
                return i;
            }
        }

        return -1;
    }
}