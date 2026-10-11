class Solution {
    public int mySqrt(int x) {
        if(x < 2){
            return x;
        }

        int i = 1, j = x/2;
        int ans = -1;

        while(i <= j){
            int mid = i + (j - i) / 2;
            long sqr =(long) mid*mid;

            if(sqr < x){
                ans = mid;
                i = mid+1;
            }else if(sqr > x){
                j = mid-1;
            }else{
                return mid;
            }
        }
        return ans;
    }
}