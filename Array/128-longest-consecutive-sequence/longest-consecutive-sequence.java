class Solution {
    public int longestConsecutive(int[] nums) {
        if(nums.length == 0){
            return 0;
        }
        HashSet<Integer> set = new HashSet<>();
        for(int n : nums){
            set.add(n);
        }

        int cnt = 1, max = 1;
        for(int n : set){
            if(set.contains(n-1)) continue;
            else{
                int elem = n;
                while(set.contains(elem + 1)){
                    cnt++;
                    elem++;
                }
                max = Math.max(cnt, max);
                cnt = 1;
            }
        }

        return max;
    }
}