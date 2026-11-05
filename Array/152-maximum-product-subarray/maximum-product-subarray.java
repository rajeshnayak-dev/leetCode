
class Solution {
    public int maxProduct(int[] nums) {
        int maxProduct = nums[0];
        int minProduct = nums[0];
        int result = nums[0];

        for (int i = 1; i < nums.length; i++) {

            int n = nums[i];

            if (n < 0) {
                int temp = maxProduct;
                maxProduct = minProduct;
                minProduct = temp;
            }

            maxProduct = Math.max(n, maxProduct * n);
            minProduct = Math.min(n, minProduct * n);

            result = Math.max(result, maxProduct);
        }

        return result;
    }
}
