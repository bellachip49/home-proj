public class Gameboard {
    String[][] board = new String[3][3];

    String[][] getBoard(){
        return board;
    }

    String[][] makeBoard(){
        for(int row = 0; row < board.length; row++){
            for(int col = 0; col < board[row].length; col++){
                board[row][col] = "-";
            }
        }
        return board;
    }
    void printBoard() {
        for (int row = 0; row < board.length; row++) {
            for (int col = 0; col < board[row].length; col++) {
                System.out.print(board[row][col] + " ");
            }
            System.out.println();
        }
    }
}
