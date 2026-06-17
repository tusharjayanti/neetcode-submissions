class Solution {
    public int[] topKFrequent(int[] nums, int k) {

        // O(K) space
        HashMap<Integer, Integer> frequencies = new HashMap<>();

        // O(n) time
        for(int n : nums) {
            frequencies.put(n,frequencies.getOrDefault(n,0)+1);
        }

        PriorityQueue<Integer> minHeap = new PriorityQueue<>(
            (a,b)-> Integer.compare(
                frequencies.get(a),frequencies.get(b)));

        for( int n : frequencies.keySet()) {
            minHeap.offer(n);

            if(minHeap.size() > k) {
                minHeap.poll();
            }
        }
        int[] res = new int[k];
        for(int i=0;i<k;i++) {
            res[i]=minHeap.poll();
        }

        return res;
    }
}
