class Solution {
    public int maxArea(int[] heights) {
        int maximumArea = 0;

        int l = 0;
        int r = heights.length-1;

        while(l<r) {
            int area = Math.min(heights[l],heights[r]) * (r-l);
            maximumArea = Math.max(area, maximumArea); 
            if(heights[l]<=heights[r]) {
                l++;
            } else {
                r--;
            }
        }
        return maximumArea;
    }
}
