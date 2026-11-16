class Solution {
    public int[] dailyTemperatures(int[] temperatures) {
        int n = temperatures.length ; 

        Stack<Integer> stack = new Stack() ; 
        int[] answer = new int[n] ; 

        for(int i=0 ; i < n ; i++) {
            int current = temperatures[i] ;

            while(!stack.isEmpty() && current > temperatures[stack.peek()]) {
                int pop = stack.pop() ; 
                answer[pop] = i-pop ; 
            }

            stack.add(i) ; 
        }

        return answer ; 
    }
}
