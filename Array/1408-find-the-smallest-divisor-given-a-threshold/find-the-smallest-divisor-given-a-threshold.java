class Solution {
    int divSum(int [] nums, int div){
        int sum = 0;
        for(int n : nums){
            int val = (int)Math.ceil((double)n / div);
            sum += val;
        }
        return sum;
    }
    public int smallestDivisor(int[] nums, int threshold) {
        int max = -1;
        for(int n : nums){
            max = Math.max(max, n);
        }

        int low = 1;
        int high = max, ans = 0;
        while(low <= high){
            int mid = low + (high - low) / 2;
            int val = divSum(nums, mid);

            if(val <= threshold){
                ans = mid;
                high = mid - 1;
            }else{
                low = mid + 1;
            }
        }
        return ans;
    }
}