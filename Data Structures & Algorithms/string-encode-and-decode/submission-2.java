class Solution {

    public String encode(List<String> strs) {
        StringBuilder sb = new StringBuilder() ; 

        for(String str: strs) {

            sb = sb.append(str.length()) ; // append the length of string 
            sb = sb.append("#") ; // append the # 

            sb = sb.append(str) ; // append the word
        }

        return sb.toString() ; 
    }

    public List<String> decode(String str) {
        List<String> result = new ArrayList<>() ; 

        int i = 0 ; // starting position of each string 

        while(i < str.length()) {

            int j = i ; // search for # 

            while(str.charAt(j) != '#') {
                j++ ; 
            }

            int length = Integer.parseInt(str.substring(i, j)) ; 

            i = j+1 ; // moving i after the # 

            String word = str.substring(i, i+length) ; 
            result.add(word) ; 

            i = i+length ; // next string 
        }

        return result ; 
    }
}
