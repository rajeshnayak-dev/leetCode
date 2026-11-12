class Solution {
    public boolean isValidSudoku(char[][] board) {
        HashSet<Character> set;

        // Check row
        for(int i = 0; i < board.length; i++){
            set = new HashSet<>();
            for(int j = 0; j < board[0].length; j++){
                if(board[i][j] == '.') continue;
                
                if(set.contains(board[i][j])){
                    return false;
                }

                set.add(board[i][j]);
            }
        }

        // Check Col
        for(int i = 0; i < board.length; i++){
            set = new HashSet<>();
            for(int j = 0; j < board[0].length; j++){
                if(board[j][i] == '.') continue;

                if(set.contains(board[j][i])){
                    return false;
                }

                set.add(board[j][i]);
            }
        }

        // Check 3x3 matrix
        for(int row = 0; row < 9; row += 3){
            for(int col = 0; col < 9; col += 3){
                set = new HashSet<>();
                for(int i = row; i < row + 3; i++){
                    for(int j = col; j < col + 3; j++){
                        if(board[i][j] == '.') continue;

                        if(set.contains(board[i][j])){
                            return false;
                        }

                        set.add(board[i][j]);
                    }
                }
            }
        }

        return true;
        
    }
}