class Solution {
    public int maxArea(int[] heights) {
        int n = heights.length ; 
        int maxArea = 0 ; 
        int left = 0 ; 
        int right = n-1 ; 

        while(left < right) {
            int breadth = right-left ; 
            int height = Math.min(heights[left], heights[right]) ; 

            int area = breadth*height ; 
            maxArea = Math.max(maxArea, area) ; 

            if(heights[left] < heights[right]) {
                left ++ ; 
            } else {
                right-- ; 
            }
        }

        return maxArea ; 
    }
}
