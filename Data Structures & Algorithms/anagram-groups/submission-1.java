class Solution {
    boolean check(String str1, String str2){
        if(str1.length() != str2.length())return false;
        int[] count = new int[26];
        Arrays.fill(count,0);
        for(int i=0; i<str1.length(); i++){
            count[str1.charAt(i) - 'a']++;
             count[str2.charAt(i) - 'a']--;
        }
        for(int i=0; i<26; i++){
            if(count[i] != 0)return false;
        }
        return true;
    }

    public List<List<String>> groupAnagrams(String[] strs) {
        List<List<String>> allAnagrams = new ArrayList<>();
        List<Integer> trackList = new ArrayList<>();
        for(int k = 0; k < strs.length; k++) trackList.add(0);
        Collections.fill(trackList, 0); 
        for(int i=0; i<strs.length; i++){
            if(trackList.get(i) != 1){
                List<String> sameAnagrams = new ArrayList<>();
                sameAnagrams.add(strs[i]);
                trackList.set(i, 1);
                for(int j = i+1; j<strs.length; j++){
                    if(trackList.get(j) != 1){
                        if(check(strs[i], strs[j])){
                            trackList.set(j, 1);
                            sameAnagrams.add(strs[j]);
                        }
                    }
                }
                allAnagrams.add(sameAnagrams);
            }
        }
        return allAnagrams;  
    }
}
