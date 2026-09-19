class Solution {
    public int maxArea(int[] heights) {
        int maxWater = 0, i = 0, j = heights.length -1;
        while(i<j){
            int currWater = Math.min(heights[i], heights[j]) * (j-i);
            maxWater = Math.max(maxWater, currWater);
            if(heights[i] <= heights[j])i++;
            else j--;
        }
        return maxWater;
    }
}
