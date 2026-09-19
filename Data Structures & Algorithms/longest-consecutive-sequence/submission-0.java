class Solution {
    public int longestConsecutive(int[] nums) {
        Set<Integer> set = new HashSet<>();

        for(int i : nums){
            set.add(i);
        }
        int maxConsecutive = 0;
        for(int i: set){
            if(!set.contains(i-1)){
                int count = 0, num = i;
                while(set.contains(num)){
                    count++; num++;
                }
                maxConsecutive = Math.max(maxConsecutive, count);
            }
        }
        return maxConsecutive;
    }
}
