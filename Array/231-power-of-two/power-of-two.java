class Solution {
    String convert2Binary(int n){
        String s = "";
        while(n >= 1){
            s += n % 2;
            n /= 2;
        }

        return s;
    }
    public boolean isPowerOfTwo(int n) {
        String s = convert2Binary(n);
        int cnt = 0;
        for(int i = 0; i < s.length(); i++){
            char ch = s.charAt(i);
            if(ch == '1'){
                cnt++;
            }

            if(cnt > 1) return false;
        }

        return cnt == 1;
    }
}