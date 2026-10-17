class Solution {
    public int maxDepth(String s) {
        int max = 0;
        int cnt = 0;
        for(int i = 0; i < s.length(); i++){
            char ch = s.charAt(i);

            if(ch == '('){
                cnt++;
            }else if(ch == ')'){
                max = Math.max(max, cnt);
                cnt--;
            }
        }
        return max;
    }
}