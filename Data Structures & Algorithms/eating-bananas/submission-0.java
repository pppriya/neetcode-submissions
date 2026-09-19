class Solution {
    public int minEatingSpeed(int[] piles, int h) {
        int start = 1, end = piles[0];
        for(int i=0; i<piles.length; i++){
            end = Math.max(end, piles[i]);
        }
        int minSpeed = end;
        while(start <= end){
            int mid = start + (end-start)/2;
            int currSpeed = 0;
            for(int i=0; i<piles.length; i++){
                currSpeed  += piles[i]/mid;
                if(piles[i]%mid != 0)currSpeed++;
            }
            if(currSpeed <= h){
                minSpeed = Math.min(minSpeed, mid);
                end = mid - 1;
            }else start = mid+1;
        }
        return minSpeed;
    }
}
