class Solution {
    public int longestConsecutive(int[] nums) {

        if(nums.length == 0) return 0;
        
        HashSet<Integer>set = new HashSet<>();
        for(int n : nums){
            set.add(n);
        }

        int l = 0;

        for(int n : set){
            nums[l++] = n;
        }

        Arrays.sort(nums, 0, l);

        int cnt = 1;
        int max = 1;

        for(int i = 1; i < l; i++){
            if(nums[i] == nums[i-1] + 1){
                cnt++;
            }else{
                cnt = 1;
            }
            max = Math.max(max,cnt);
        }

        return max;
    }
}