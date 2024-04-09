import java.util.ArrayList;
import java.util.List;

public class DS18Backtracking {

    public static void printPermutation(String str, String perm, int idx){
        if(str.length() == 0){
            System.out.println(perm);
            return;
        }

        for(int i =0; i<str.length();i++){
        char currChar = str.charAt(i);
        String newStr = str.substring(0, i) + str.substring(i + 1);
         
        printPermutation(newStr, perm + newStr, idx+1);
        }
    }
    //INCOMPLETE
    //N queens problem
    //on a 4x4 chess board
    //place 4 queens on the board in a way that they can't contradict each other
    //There will be only two possible combinations for a 4x4 chess board with 4 queens 
    public boolean isSafe(int row, int col, char[][]board){
        //to chack horizontal line
        for(int j = 0, j<board.length;j++){
            if(board[row][j] == 'Q'){
                return false;
            }
        }

        //Vertical
        for(int i = 0, i<board[0].length;i++){
            if(board[i][col] == 'Q'){
                return false;
            }
        }
        //Lower Left
        int r = row;
        for(int c = col; c>=0 && r>=0; c--, r--){
            if(board[r][c] == 'Q'){
                return false;
            }
        }
    }
    public void helper(char[][] board, List<List<String> allBoards, int col){
        if(col == board.length){
            saveBoard(board, allBoards);
            return;
        }
        for(int row = 0; row< board.length; row++){
            if(isSafe(row,col, board)){
                board[row][col] = 'Q';
                helper(board, allBoards, col+1);
                board[row][col] = '.';
            }
        }

    }
    
    public List<List<String>> solveNQueens(int n){
        List<List<String>> allBoards = new ArrayList<>();
        char[][] board = new board[n][n];

        helper(board, allBoards, 0);
    } 
    

    public static void main(String[] args) {
        String str = "ABC";
        printPermutation(str, "", 0);
    }
}
