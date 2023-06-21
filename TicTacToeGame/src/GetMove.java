import java.util.Scanner;

public class GetMove {
    Scanner input = new Scanner(System.in);
    String[][] origCpy = new String[3][3];
    int row = -1;
    int col = -1;

    void getRow(){
        while(row < 1 || row > 3){
            System.out.println("Please input a row number from 1 to 3: ");
            row = input.nextInt();
            if(row < 1 || row > 3){
                System.out.println("Invalid input.");
            }
        }
        row--; //subtract 1 from answer to match array indexes
    }

    void getCol(){
        while(col < 1 || col > 3){
            System.out.println("Please input a column number from 1 to 3: ");
            col = input.nextInt();
            if(col < 1 || col > 3){
                System.out.println("Invalid input.");
            }
        }
        col--; //subtract 1 from answer to match array indexes
    }

    String[][] makeMove(String[][] board, String symbol){
        origCpy = board; //original copy for comparison
        if(board[row][col].equals("-")) {
            board[row][col] = symbol;
        }
        return board;
        //if spot is taken, return unchanged board; do board comparison in another function; recognize unchanged board and call
        //for a repeat of row & col inputs
    }

    boolean checkChange(String[][] board){
        if(board.equals(origCpy)){
            System.out.println("The chosen location of your move was invalid. Try again.");
            return true;
        }else{
            return false;
        }
    }
}
