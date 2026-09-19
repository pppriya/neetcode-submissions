class Solution {
    public int maxArea(int[] heights) {
        int maxWater = 0;
        for(int i=0; i<heights.length; i++){
            for(int j=i; j<heights.length; j++){
                int currWater = Math.min(heights[i],heights[j])* (j-i);
                maxWater = Math.max(maxWater, currWater);
            }
        }
        return maxWater;
    }
}
