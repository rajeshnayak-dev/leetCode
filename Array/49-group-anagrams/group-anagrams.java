class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {

        List<List<String>> res = new ArrayList<>();
        HashMap<String, List<String>> map = new HashMap<>();

        for (int i = 0; i < strs.length; i++) {

            char[] ch = strs[i].toCharArray();
            Arrays.sort(ch);

            String sorted = new String(ch);

            if (map.containsKey(sorted)) {
                map.get(sorted).add(strs[i]);
            } 
            else {
                List<String> list = new ArrayList<>();
                list.add(strs[i]);
                map.put(sorted, list);
            }
        }

        return new ArrayList<>(map.values());
    }
}