class Solution {
    int cntShip(int [] nums, int mid){
        int ship = 1, sum = 0;
        for(int i = 0; i < nums.length; i++){
            if(sum + nums[i] <= mid){
                sum += nums[i];
            }else{
                ship++;
                sum = nums[i];
            }
        }
        return ship;
    }
    public int shipWithinDays(int[] weights, int days) {
        int low = 0, high = 0;
        for(int n : weights){
            low = Math.max(low, n);
            high += n;
        }

        while(low < high){
            int mid = low + (high - low) / 2;
            int ship = cntShip(weights, mid);

            if(ship <= days){
                high = mid;
            }
            else {
                low = mid + 1;
            }

        }
        return low;
    }
}