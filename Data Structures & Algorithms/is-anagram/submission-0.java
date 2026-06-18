class Solution {
    public boolean isAnagram(String s, String t) {
        int s_length = s.length();
        int t_length = t.length();

        if(s_length!=t_length) {
            return false;
        }

        int[] frequencies = new int[26];

        for( int i=0; i<s_length; i++) {
            frequencies[s.charAt(i)-'a']++;
        }

        for( int i=0; i<s_length; i++) {
            frequencies[t.charAt(i)-'a']--;
        }

        for( int i : frequencies) {
            if(i!=0) {
                return false;
            }
        }
        
        return true;
    }
}
