class Solution {
    public int findKthPositive(int[] arr, int k) {
        int ans = k;
        for(int n : arr){
            if(n <= ans){
                ans++;
            }else{
                break;
            }
        }
        return ans;
    }
}