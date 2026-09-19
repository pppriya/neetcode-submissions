class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        Map<Integer,Integer> map = new HashMap<>();
        for(int i : nums){
            map.put(i, map.getOrDefault(i, 0 ) + 1);
        }
        Queue<int[]> priorityQueue = new PriorityQueue<>(new Comparator<int[]>(){
            @Override
            public int compare(int[] a, int [] b){
                return b[0] - a[0];
            }
        });
        for(int key : map.keySet()){
            priorityQueue.offer(new int[]{map.get(key), key});
        }
        int [] topK = new int[k];
        int i = 0;
        while(i<k){
            int[] topArray = priorityQueue.poll();
            topK[i] = topArray[1];
            i++;
        }
        return topK;
    }
}
