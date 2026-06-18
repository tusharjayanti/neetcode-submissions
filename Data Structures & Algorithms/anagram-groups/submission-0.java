class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        List<List<String>> result = new ArrayList<>();
        if(strs.length==1) {
            result.add(Arrays.asList(strs[0]));
            return result;
        }
        final Map<String, List<String>> anagrams = new HashMap<>();
        for( String s : strs) {
            String key = createFrequenciesString(s);
            if(!anagrams.containsKey(key)) {
                anagrams.put(key, new ArrayList<>());
            }
            anagrams.get(key).add(s);
        }

        return new ArrayList<>(anagrams.values());
    }

    public static String createFrequenciesString(String s) {
        char[] frequencies = new char[26];

        for(int i=0; i<s.length(); i++) {
            frequencies[s.charAt(i)-'a']++;
        }
        return String.valueOf(frequencies);
    }
}
