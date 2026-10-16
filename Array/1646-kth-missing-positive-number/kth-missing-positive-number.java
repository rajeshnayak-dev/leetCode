class Solution {
    int missingNum(int [] arr, int idx){
        return arr[idx] - idx - 1;
    }
    public int findKthPositive(int[] arr, int k) {
        int low = 0, high = arr.length - 1;

        while(low <= high){
            int mid = low + (high - low) / 2;
            int ans = missingNum(arr, mid);

            if(ans < k){
                low = mid + 1;
            }else{
                high = mid - 1;
            }
        }
        return low + k;
    }
}