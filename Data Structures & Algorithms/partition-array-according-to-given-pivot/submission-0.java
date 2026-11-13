class Solution {
    public int[] pivotArray(int[] nums, int pivot) {
        int lessCount = 0 ; 
        int equalCount = 0 ; 

        // count smaller and equal elements 

        for(int num: nums) {
            if(num < pivot) {
                lessCount++ ; 
            } else if (num == pivot) {
                equalCount++ ; 
            }
        }

        int[] result = new int[nums.length] ; 

        int left = 0 ; 
        int mid = lessCount ; 
        int right = lessCount + equalCount ; 

        for(int num: nums) {
            if(num < pivot) {
                result[left] = num ; 
                left++ ; 
            } else if (num == pivot) {
                result[mid] = num ; 
                mid++ ; 
            } else {
                result[right] = num ; 
                right++ ; 
            } 
        }

        return result ; 
    }
}
