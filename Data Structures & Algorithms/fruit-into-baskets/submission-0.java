class Solution {
    public int totalFruit(int[] fruits) {
        Map<Integer, Integer> map = new HashMap<>() ; 
        int n = fruits.length ; 
        int result = 0 ; 

        int left = 0 ; 

        for(int right = 0 ; right < n ; right++) {
            int incomingFruit = fruits[right] ; 

            map.put(incomingFruit, map.getOrDefault(incomingFruit, 0) + 1) ; 

            if(map.size() <= 2) {
                int length = right - left + 1 ; 
                result = Math.max(result, length) ; 
            } else {
                int outgoingFruit = fruits[left] ; 
                map.put(outgoingFruit, map.get(outgoingFruit)-1) ; 

                if(map.get(outgoingFruit) == 0) {
                    map.remove(outgoingFruit) ; 
                }

                left++ ; 
            }
        }

        return result ; 
    }
}