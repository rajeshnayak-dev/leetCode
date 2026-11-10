class Solution {
    public int longestConsecutive(int[] nums) {
        HashSet<Integer> set = new HashSet<>();
        for(int n : nums){
            set.add(n);
        }

        int max = 0;
        for(int n : set){
            if(!set.contains(n-1)){
                int cnt = 1, elem = n;

                while(set.contains(elem + 1)){
                    cnt++; elem++;
                } 

                max = Math.max(max, cnt);
            }
        }
        return max;
    }
}