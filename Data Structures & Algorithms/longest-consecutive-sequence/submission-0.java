class Solution {
    public int longestConsecutive(int[] nums) {
            Set<Integer> numSet = new HashSet<>();

            for(int num : nums) {
                numSet.add(num);
            }

            int longestConsecutiveSequence = 0;

            for(int num : numSet) {
                if(!numSet.contains(num-1)) {
                    int length = 1;
                    while(numSet.contains(num+length)) {
                        length++;
                    }
                    longestConsecutiveSequence = 
                        Math.max(longestConsecutiveSequence,length);
                }
            }
            return longestConsecutiveSequence;
    }
}
