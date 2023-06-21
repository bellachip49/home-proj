public class Runner {
    public static void main(String [] args){
        //make objects
        Gameboard game = new Gameboard();
        GetMove move = new GetMove();
        CheckWin checkGame = new CheckWin();

        //use objects
        game.makeBoard();
        game.printBoard();
        while(checkGame.checkFull(game.getBoard())){
            move.getRow();
            move.getCol();
            //add checkchange function
            move.makeMove(game.getBoard(), "X");
            move.getRow();
            move.getCol();
            //add checkchange function
            move.makeMove(game.getBoard(), "O");
        }
    }
}
