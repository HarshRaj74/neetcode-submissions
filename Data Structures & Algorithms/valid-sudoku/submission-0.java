class Solution {
    public boolean isValidSudoku(char[][] board) {
        
        HashSet<Character> set=new HashSet<>();
        //row check
        for(int i=0; i<9 ; i++){
            for(int j=0; j<9 ; j++){
                if(board[i][j] == '.') continue;
                if(set.contains(board[i][j])){
                    return false;
                }
                else{
                    set.add(board[i][j]);
                }
            }
            set.clear();   
        }
        //column check
        for(int i=0; i<9 ; i++){
            
            for(int j=0; j<9 ; j++){
                if(board[j][i] == '.') continue;
                if(set.contains(board[j][i])){
                    return false;
                }
                else{
                    set.add(board[j][i]);
                }
            }   
            set.clear();
        }

        //block wise check
        for(int i=0; i<9 ; i++){
            for(int j=0; j<9 ; j++){
                if(board[((i/3)*3+j/3)][((i%3)*3+j%3)] == '.') continue;
                if(set.contains(board[((i/3)*3+j/3)][((i%3)*3+j%3)])){
                    return false;
                }
                else{
                    set.add(board[((i/3)*3+j/3)][((i%3)*3+j%3)]);
                }
            }   
            set.clear();
        }
        return true;
    }
}
