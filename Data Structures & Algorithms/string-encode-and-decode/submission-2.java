class Solution {

    public String encode(List<String> strs) {
        List<Integer> sizes = new ArrayList<>();
        StringBuilder strings = new StringBuilder();
        StringBuilder encoded = new StringBuilder();
        for(int i=0; i<strs.size(); i++){
            sizes.add(strs.get(i).length());
            strings.append(strs.get(i));
        }
        for(int i=0; i<sizes.size(); i++){
            encoded.append(sizes.get(i)).append(',');
        }
        return encoded.append('#').append(strings).toString();
    }

    public List<String> decode(String str) {
        List<Integer> sizes = new ArrayList<>();
        int i = 0;
        while(i <str.length() && str.charAt(i) != '#'){
            int j = i, currSize = 0;
            while(str.charAt(j) != ','){
                currSize = currSize*10 + Integer.parseInt(str.charAt(j) + "");
                j++;
            }
            sizes.add(currSize);
            i=j+1;
        }
        i++;
        int len = 0;
        List<String> strings = new ArrayList<>();
        System.out.print(sizes.size());
       for(int j=0; j<sizes.size(); j++){
            String currStr = str.substring(i, i+sizes.get(j));
            i = i+sizes.get(j);
            strings.add(currStr);
       }
        return strings ;

    }
}
