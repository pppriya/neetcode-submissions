class Solution {

    public String encode(List<String> strs) {
        StringBuilder encoded = new StringBuilder();
        for(String curr : strs){
            encoded.append(curr.length());
            encoded.append("*");
            encoded.append(curr);
        }
        return encoded.toString();
    }

    public List<String> decode(String str) {
        List<String> decoded = new ArrayList<>();
        int i = 0;
        while(i<str.length()){
            int len = 0;
            StringBuilder curr = new StringBuilder();
            while(str.charAt(i) != '*'){
                len = len * 10 + (str.charAt(i) - '0');
                i++;
            }
            i++;
            while(len>0 && i<str.length()){
                curr.append(str.charAt(i));
                i++;
                len--;
            }
            decoded.add(curr.toString());
        }
        return decoded;
    }
}
