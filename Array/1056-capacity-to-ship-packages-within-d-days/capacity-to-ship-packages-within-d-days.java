class Solution {
    public int shipWithinDays(int[] weights, int days) {
        int low = 0, high = 0;
        for(int n : weights){
            low = Math.max(low, n);
            high += n;
        }
        int ans = high;

        while(low <= high){
            int mid = low + (high - low) / 2;

            int d = 1;
            int sum = 0;
            for(int i = 0; i < weights.length; i++){
                if(sum + weights[i] <= mid){
                    sum += weights[i];
                }else{
                    d++;
                    sum = weights[i];
                }
            }

            if(d <= days){
                ans = mid;
                high = mid - 1;
            }else{
                low = mid + 1;
            }
        }
        return ans;
    }
}