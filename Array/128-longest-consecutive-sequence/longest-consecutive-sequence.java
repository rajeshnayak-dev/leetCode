class Solution {
    public int longestConsecutive(int[] nums) {
        HashSet<Integer> set = new HashSet<>();
        for(int n : nums){
            set.add(n);
        }

        int max = 0;
        for(int n : set){
            int cnt = 1;
            if(!set.contains(n - 1)){
                while(set.contains(n + 1)){
                    cnt++;
                    n++;
                }

                max = Math.max(max, cnt);
            }
        }

        return max;
    }
}