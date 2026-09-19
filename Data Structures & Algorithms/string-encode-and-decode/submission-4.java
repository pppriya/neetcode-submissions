class Solution {

    public String encode(List<String> strs) {
        StringBuilder encoded = new StringBuilder();
        for(String str : strs){
            encoded.append(str.length() + "_" + str);
        }
        return encoded.toString();
    }

    public List<String> decode(String str) {
        System.out.println(str);
        List<String> result = new ArrayList<>();
        for(int i=0; i<str.length(); ){
            int length = 0;
            while( str.charAt(i) != '_'){
                length = length*10 + (str.charAt(i) - '0');
                i++;
                if(i>= str.length())return result;
            }
            i++;
            result.add(str.substring(i,i+length));
            i = i+length;
        }
        return result;
    }
}
