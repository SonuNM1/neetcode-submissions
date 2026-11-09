class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        int n = nums.length ; 
        Arrays.sort(nums) ; 
        List<List<Integer>> result = new ArrayList<>() ; 

        for(int i=0 ; i < nums.length-2 ; i++) {

            // duplicy check for the number being fixed 

            if(i > 0 && nums[i] == nums[i-1]) {
                continue ; 
            }

            int num1 = nums[i] ; 
            int target = -num1 ; 

            twoSum(nums, target, i+1, n-1, result) ; 
        }
        return result ; 
    }

    private void twoSum(int[] nums, int target, int start, int end, List<List<Integer>> result) {
        while(start < end) {
            int sum = nums[start] + nums[end] ; 

            if(sum == target) {
                result.add(Arrays.asList(-target, nums[start], nums[end])) ; 

                start++ ; 
                end-- ; 

                while(start < end && (nums[start] == nums[start-1])) {
                    start++ ;
                } 

                while(start < end && (nums[end] == nums[end+1])) {
                    end-- ; 
                }

            } else if(sum < target) {
                start++ ; 
            } else {
                end -- ; 
            }
        }
    }
}
