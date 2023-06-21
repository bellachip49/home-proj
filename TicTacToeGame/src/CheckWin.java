public class CheckWin {
    boolean checkWin(String[][] board){ //8 possible combinations
        //diagonals
        if(board[0][0].equals(board[1][1]) && board[0][0].equals(board[2][2]) && !board[0][0].equals("-")){
            return true;
        }
        else if(board[0][2].equals(board[1][1]) && board[0][2].equals(board[2][0]) && !board[0][2].equals("-")){
            return true;
        }

        //horizontal
        else if(board[0][0].equals(board[0][1]) && board[0][0].equals(board[0][2]) && !board[0][0].equals("-")){ //horiz. first row
            return true;
        }
        else if(board[1][0].equals(board[1][1]) && board[1][0].equals(board[1][2]) && !board[1][0].equals("-")){ //horiz. second row
            return true;
        }
        else if(board[2][0].equals(board[2][1]) && board[2][0].equals(board[2][2]) && !board[2][0].equals("-")){ //horiz. third row
            return true;
        }

        //vertical
        else if(board[0][0].equals(board[1][0]) && board[0][0].equals(board[2][0]) && !board[0][0].equals("-")){ //vert. first col
            return true;
        }
        else if(board[0][1].equals(board[1][1]) && board[0][1].equals(board[2][1]) && !board[0][1].equals("-")){ //vert. second row
            return true;
        }
        else if(board[0][2].equals(board[1][2]) && board[0][2].equals(board[2][2]) && !board[0][2].equals("-")){ //vert. third row
            return true;
        }
        else{
            return false;
        }
    }//find conditionals for winning combinations

    boolean checkFull(String [][] board){
        for(int i = 0; i < board.length; i++){
            for(int j = 0; j < board[0].length; j++){
                if(board[i][j].equals("-")){
                    return true;
                }
            }
        }
        return false;
    }
}
