class Solution {
    int cntArray(int [] nums, int val){
        int arrnum = 1, sum = 0;

        for(int i = 0; i < nums.length; i++){
            if(sum + nums[i] <= val){
                sum += nums[i];
            }else{
                arrnum++;
                sum = nums[i];
            }
        }
        return arrnum;
    }
    public int splitArray(int[] nums, int k) {
        int low = 0, high = 0;
        for(int n : nums){
            low = Math.max(low, n);
            high += n;
        }

        while(low < high){
            int mid = low + (high - low) / 2;
            int val = cntArray(nums, mid);

            if(val <= k){
                high = mid;
            }else{
                low = mid + 1;
            }
        }
        return low;
    }
}