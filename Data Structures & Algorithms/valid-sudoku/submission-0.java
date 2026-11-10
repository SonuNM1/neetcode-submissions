class Solution {
    public boolean isValidSudoku(char[][] board) {
        return isValidRow(board) 
            && isValidColumn(board)
            && isValidBox(board) ; 
    }

    private boolean isValidRow(char[][] board) {
        for(int row=0 ; row < 9 ; row++) {
            Set<Character> set = new HashSet<>() ; 
            
            for(int col=0 ; col < 9 ; col++) {
                if(board[row][col] == '.') continue ; 

                if(set.contains(board[row][col])) {
                    return false ; 
                }
                set.add(board[row][col]) ; 
            }
        }
        return true ; 
    }

    private boolean isValidColumn(char[][] board) {
        for(int col=0 ; col < 9 ; col++) {
            Set<Character> set = new HashSet<>() ; 

            for(int row=0 ; row < 9 ; row++) {
                if(board[row][col] == '.') continue ; 

                if(set.contains(board[row][col])) {
                    return false ; 
                }

                set.add(board[row][col]) ; 
            }
        }
        return true ;
    }

    private boolean isValidBox(char[][] board) {
        for(int startRow =0 ; startRow < 9 ; startRow += 3) {
            for(int startCol = 0 ; startCol < 9 ; startCol += 3) {
                if(!isValidSingleBox(board, startRow, startCol)) {
                    return false ; 
                }
            }
        }
        return true ; 
    }

    private boolean isValidSingleBox(char[][] board, int startRow, int startCol) {

        Set<Character> set = new HashSet<>() ; 

        for(int row=startRow ; row < startRow+3 ; row++) {
            for(int col=startCol ; col < startCol+3 ; col++) {

                if(board[row][col] == '.') continue ; 

                if(set.contains(board[row][col])) {
                    return false ; 
                }

                set.add(board[row][col]) ; 
            }
        }
        return true ; 
    }
}

