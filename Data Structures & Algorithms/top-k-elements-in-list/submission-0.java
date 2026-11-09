class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        Map<Integer, Integer> map = new HashMap<>() ; 

        for(int num: nums) {
            map.put(num, map.getOrDefault(num, 0) + 1) ; 
        }

        Queue<Integer> minHeap = new PriorityQueue<>(
            (a,b) -> Integer.compare(map.get(a), map.get(b))
        ) ; 

        // adding the num from minHeap to the map 

        for(int num: map.keySet()) {
            minHeap.add(num) ; 

            if(minHeap.size() > k) {
                minHeap.poll() ; 
            }
        }

        // inserting the num from minHeap to the result array 

        int[] result = new int[k] ; 
        int i=0 ; 

        for(int num: minHeap) {
            result[i] = num ; 
            i++ ; 
        } 

        return result ; 
    }
}
