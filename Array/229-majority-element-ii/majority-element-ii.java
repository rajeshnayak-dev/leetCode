
class Solution {
    public List<Integer> majorityElement(int[] nums) {
        int n = nums.length;
        List<Integer> list = new ArrayList<>();

        int time = n / 3;
        HashMap<Integer, Integer> map = new HashMap<>();

        for (int k : nums) {

            if (map.containsKey(k)) {
                map.put(k, map.get(k) + 1);
            } else {
                map.put(k, 1);
            }

        }

        for (int k : map.keySet()) {
            if (map.get(k) > time) {
                list.add(k);
            }
        }

        return list;
    }
}
