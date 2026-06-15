class Solution {

    public String encode(List<String> strs) {
            StringBuilder encoding = new StringBuilder();
            for(String s : strs) {
                encoding.append(s.length());
                encoding.append(",");
            }
            encoding.append("#");
            for(String s : strs) {
                encoding.append(s);
            }
            return encoding.toString();
    }

    public List<String> decode(String str) {
        
        String[] parts = str.split("#",2);

        String[] lengths = parts[0].split(",");

        List<String> result = new ArrayList<>();
        int idx =0;
        for( String s : lengths) {
            if(s.isEmpty()) continue;
            int x = Integer.parseInt(s);
            result.add(parts[1].substring(idx,idx+x));
            idx+=x;
        }
        return result;
    }
}
