class Solution {
    int missingNumber(int[]arr, int idx){
        return arr[idx] - idx - 1;
    }
    public int findKthPositive(int[] arr, int k) {
        int low = 0, high = arr.length;

        while(low < high){
            int mid = low + (high - low) / 2;
            int missing = missingNumber(arr, mid);

            if(missing < k){
                low = mid+1;
            }else{
                high = mid;
            }
        }
        return low + k;
    }
}