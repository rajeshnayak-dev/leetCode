class Solution {
    public int longestConsecutive(int[] nums) {
        if(nums.length == 0) return 0;

        int cnt = 1;
        int max = 1;

        HashSet<Integer>set = new HashSet<>();
        for(int n : nums){
            set.add(n);
        }

        for(int n : set){
            if(!set.contains(n-1)){
                cnt = 1;
                while(set.contains(n+cnt)){
                    cnt++;
                }
                max = Math.max(max,cnt);
            }
        }
        return max;
    }
}