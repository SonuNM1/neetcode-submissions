class Solution {
    public boolean checkSubarraySum(int[] nums, int k) {
        int n = nums.length ; 
        int sum = 0 ; 

        Map<Integer, Integer> map = new HashMap<>() ; // (Remainder, Index) 

        map.put(0, -1) ; 

        for(int i=0 ; i < n; i ++) {
            sum += nums[i] ; 

            int remainder = sum % k ; 

            if(map.containsKey(remainder)) {
                int subarraySize = i - map.get(remainder) ; 

                if(subarraySize >= 2) {
                    return true ; 
                }
            } else {
                map.put(remainder, i) ; 
            }
        }

        return false ; 
    }
}