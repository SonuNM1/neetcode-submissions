class Solution {
    public int minSubArrayLen(int target, int[] nums) {
        int minLength = Integer.MAX_VALUE ; 
        int sum = 0 ; 
        int left = 0 ; 

        // expanding the window with right pointer 

        for(int right = 0 ; right < nums.length ; right++) {
            sum += nums[right] ; 

            while(sum >= target) {
                int length = right-left+1 ; 

                minLength = Math.min(minLength, length) ; 

                sum -= nums[left] ; 
                left++ ;  
            }
        } 

        // if no valid subarray found, return 0 

        return minLength == Integer.MAX_VALUE ? 0 : minLength ; 
    }
}