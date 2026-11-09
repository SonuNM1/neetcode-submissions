class Solution {

    public String encode(List<String> strs) {
        StringBuilder sb = new StringBuilder() ; 

        for(String s: strs) {
            sb.append(s.length()) ; // add the length of the word 

            sb.append("#") ; // adding as separator between the length of string and actual string 

            sb.append(s) ; 
        }

        return sb.toString() ; 
    }

    public List<String> decode(String str) {
        List<String> result = new ArrayList<>() ; 

        int i = 0 ; // starting position of each string 

        while(i < str.length()) {
            int j = i ; // searches for # 

            while(str.charAt(j) != '#') {
                j++ ; 
            }

            int length = Integer.parseInt(str.substring(i, j)) ; 

            // moving i after the # 

            i = j+1 ; 

            // extract the word 

            String word = str.substring(i, i+length) ; 
            result.add(word) ; 

            i = i+length ; // to the next string 
        }
        return result ; 
    }
}
