class Solution {
    int cntArr(int [] nums, int n){
        int split = 1, sum = 0;
        for(int i = 0; i < nums.length; i++){
            if(sum + nums[i] <= n){
                sum += nums[i];
            }else{
                split++;
                sum = nums[i];
            }
        }
        return split;
    }
    public int splitArray(int[] nums, int k) {
        int low = 0;
        int high = 0;

        for(int n : nums){
            low = Math.max(low, n);
            high += n;
        }

        while(low < high){
            int mid = low + (high - low) / 2;
            int val = cntArr(nums, mid);

            if(val <= k){
                high = mid;
            }else{
                low = mid+1;
            }
        }
        return low;
    }
}