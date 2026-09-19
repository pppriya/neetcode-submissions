class Solution {
    public int findMin(int[] nums) {
        int start = 0, end = nums.length-1, minVal = nums[0];
        while(start<=end){
            int mid = (start + end)/2;
            if(nums[start]<=nums[mid]){
                minVal = Math.min(minVal, nums[start]);
                start = mid + 1;
            }else {
                minVal = Math.min(minVal, nums[mid]);
                end = mid -1;
            }
        }
        return minVal;
    }
}
