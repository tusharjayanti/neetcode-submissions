class Solution {
    public int longestConsecutive(int[] nums) {
        int n = nums.length;
        if(n==0) return 0;
        if(n==1) return 1;

        Set<Integer> numSet = new HashSet<>();

        for( int x : nums) {
            numSet.add(x);
        }

        int longestSequence = 0;
        for(int x: numSet) {
            if(!numSet.contains(x-1)) {
                int length = 1;
                while(numSet.contains(x+length)) {
                    length++;
                }
                longestSequence = Math.max(longestSequence, length);
            }
        }
        return longestSequence;
    }
}
