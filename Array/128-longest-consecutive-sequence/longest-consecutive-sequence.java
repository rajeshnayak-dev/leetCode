class Solution {
    public int longestConsecutive(int[] nums) {
        if (nums.length == 0) return 0;

        Arrays.sort(nums);
        int max = 1;
        int cnt = 1;

        for(int i = 0; i < nums.length-1; i++){
            if (nums[i] == nums[i + 1]) {
                continue;
            }

            if(nums[i]+1 == nums[i+1]){
                cnt++;
            }else{
                max = Math.max(cnt, max);
                cnt = 1;
            }
        }
        return Math.max(max, cnt);
    }
}