class Solution {
    public int longestConsecutive(int[] nums) {
        int maxLen = 1;  
        Set<Integer> result = new HashSet<>() ; 

        if(nums.length == 0) return 0 ; 

        for(int num: nums) {
            result.add(num) ; 
        }

        for(int num: result) {
            if(!result.contains(num-1)) {
                int current = num ; 
                int length = 1 ; 

                while(result.contains(current+1)) {
                    current++ ; 
                    length++ ; 
                }

                maxLen = Math.max(maxLen, length) ; 
            }
        }
        return maxLen ; 
    }
}
