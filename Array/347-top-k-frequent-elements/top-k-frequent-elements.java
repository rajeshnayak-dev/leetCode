
class Solution {
    public int[] topKFrequent(int[] nums, int k) {

        Map<Integer, Integer> map = new HashMap<>();

        // Count frequency
        for(int i = 0; i < nums.length; i++){
            map.put(nums[i], map.getOrDefault(nums[i], 0) + 1);
        }

        // Store unique elements
        List<Integer> list = new ArrayList<>(map.keySet());

        // Sort by frequency (descending)
        list.sort((a, b) -> map.get(b) - map.get(a));

        // Get top k elements
        int[] result = new int[k];

        for(int i = 0; i < k; i++){
            result[i] = list.get(i);
        }

        return result;
    }
}
