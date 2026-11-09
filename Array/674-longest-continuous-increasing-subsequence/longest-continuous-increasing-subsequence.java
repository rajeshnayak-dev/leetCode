class Solution {
    public int findLengthOfLCIS(int[] nums) {
        int cnt = 1;
        int max = 1;
        for(int i = 0; i < nums.length - 1; i++){
            if(nums[i] < nums[i+1]){
                cnt++;
            }else{
                max = Math.max(cnt, max);
                cnt = 1;
            }
        }
        return Math.max(cnt, max);
    }
}