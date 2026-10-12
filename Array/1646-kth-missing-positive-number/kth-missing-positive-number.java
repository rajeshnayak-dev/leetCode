class Solution {
    public int findKthPositive(int[] arr, int k) {
        int low = 1, high = 0;
        for(int n : arr){
            high = Math.max(high, n);
        }

        int i = 0;
        int cnt = 0;
        while(low < high){
            if(low == arr[i] && i < arr.length){
                i++;
            }else{
                cnt++;
                if(cnt == k){
                    return low;
                }
            }
            low++;
        }
        return high + (k - cnt);
    }
}