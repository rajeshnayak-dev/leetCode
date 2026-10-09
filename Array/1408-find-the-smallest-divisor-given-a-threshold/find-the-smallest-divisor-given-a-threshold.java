class Solution {
    int division(int [] nums, int num){
        int sum = 0;
        for(int n : nums){
            int result = (int) Math.ceil((double)n/num);
            sum += result;
        }
        return sum;
    }
    public int smallestDivisor(int[] nums, int threshold) {
        int max = 0;
        for(int n : nums){
            if(n > max){
                max = n;
            }
        }
        int low = 1;
        int high = max;
        int ans = -1;

        while(low <= high){
            int mid = low + (high - low) / 2;
            int val = division(nums, mid);

            if(val <= threshold){
                ans = mid;
                high = mid - 1;
            }
            else{
                low = mid + 1;
            }
        }
        return ans;
    }
}