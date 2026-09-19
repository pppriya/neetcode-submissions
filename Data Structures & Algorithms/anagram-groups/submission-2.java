class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
      Map<String, List<String>> map = new HashMap<>();
      for(int i=0; i<strs.length; i++){
       char[] charArray = strs[i].toCharArray();
       Arrays.sort(charArray);
        String sortedArray = Arrays.toString(charArray);
        map.putIfAbsent(sortedArray, new ArrayList<>());
        map.get(sortedArray).add(strs[i]);
      }
      return new ArrayList<>(map.values());  
    }
}
