class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        int n = nums.length;
        Arrays.sort(nums);
        List<List<Integer>> triplets = new ArrayList<>();
        for(int i=0; i<n; i++){
            if( i> 0 && nums[i] == nums[i-1]) continue;
            if(nums[i] > 0)break;
            int j =i+1, k = n-1;
            while(j<k){
                if(nums[i] + nums[j] + nums[k] == 0){
                    triplets.add(List.of(nums[i], nums[j], nums[k]));
                    j++;k--;
                    while(j<k && nums[j] == nums[j-1])j++;
                }else if(nums[i] + nums[j] + nums[k] < 0){
                    j++;
                } else k--;
            } 
        }
        return triplets;
    }
}
