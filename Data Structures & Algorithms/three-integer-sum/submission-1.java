class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        List<List<Integer>> result = new ArrayList<>() ; 
        int n = nums.length ; 

        Arrays.sort(nums) ; 

        for(int i=0 ; i < nums.length-2 ; i++) {

            // no duplicates 

            if (i > 0 && (nums[i] == nums[i-1])) continue ;

            int num = nums[i] ; 
            int target = -num ; 

            twoSum(nums, target, i+1, n-1, result) ; 
        }
        return result ; 
    }
    private void twoSum(int[] nums, int target, int left, int right, List<List<Integer>> result) 
    {
        while(left < right) {
            int sum = nums[left] + nums[right] ; 

            if(sum == target) {
                result.add(Arrays.asList(-target, nums[left], nums[right])) ; 

                left++ ; 
                right-- ; 

                while(left < right && (nums[left] == nums[left-1])) {
                    left ++ ; 
                }

                while(left < right && (nums[right] == nums[right+1])) {
                    right-- ; 
                }

            } else if (sum < target) {
                left++ ; 
            } else {
                right-- ; 
            }
        }
    }
}
