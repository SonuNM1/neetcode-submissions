class Solution {
    public boolean isPalindrome(String s) {
        s = s.toLowerCase().replaceAll("[^A-Za-z0-9]", "") ; // removing the special characters 

        return validPalindrome(s) ; 
    }

    private boolean validPalindrome(String s) {
        int left = 0 ; 
        int right = s.length()-1 ; 

        while(left < right) {
            if(s.charAt(left) != s.charAt(right)) {
                return false ; 
            }
            left++ ; 
            right-- ; 
        }

        return true ; 
    }
}
