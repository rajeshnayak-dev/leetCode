class Solution {
    public int maxScore(int[] cardPoints, int k) {
        int sum = 0;
        for(int i = 0; i  < k; i++){
            sum += cardPoints[i];
        }

        int max = sum;
        int low = k - 1, high = cardPoints.length - 1;
        while(low >= 0){
            sum += cardPoints[high];
            sum -= cardPoints[low];

            max = Math.max(max, sum);

            low--; high--;
        }

        return max;
    }
}