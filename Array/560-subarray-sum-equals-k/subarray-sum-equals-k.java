
class Solution {
    public int subarraySum(int[] nums, int k) {

        HashMap<Integer, Integer> map = new HashMap<>();
        map.put(0, 1);

        int[] prefix = new int[nums.length];
        prefix[0] = nums[0];

        for (int i = 1; i < nums.length; i++) {
            prefix[i] = prefix[i - 1] + nums[i];
        }

        int cnt = 0;

        for (int i = 0; i < prefix.length; i++) {

            cnt += map.getOrDefault(prefix[i] - k, 0);

            map.put(prefix[i],
                map.getOrDefault(prefix[i], 0) + 1);
        }

        return cnt;
    }
}
