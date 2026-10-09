class Solution {
    public int searchInsert(int[] nums, int target) {
        int low = 0, high = nums.length-1;

        if(target > nums[high]) return nums.length;
        if(target < nums[low]) return 0;

        while(low <= high){
            int mid = (low + high) / 2;

            if(nums[mid] > target){
                high = mid - 1;
            }
            else if(nums[mid] < target){
                low = mid + 1;
            }
            else{
                return mid;
            }
            
            
            if(nums[mid] > target && nums[mid-1] < target){
                return mid;
            }
            if(nums[mid] < target && nums[mid+1] > target){
                return mid+1;
            }
        }
        return -1;
    }
}