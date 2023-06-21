import java.util.ArrayList;

public class CheckWin {
    //fields
    private int count = 0;

    //no getter or setter

    //other methods
    int reportCount(ArrayList<Integer> givenCards){
        count = 0;
        for (Integer val : givenCards) {
            count += val;
        }
        return count;
    }

    void whoWon(int playerCnt, int compCnt){
        if(playerCnt == 21 && compCnt == 21){
            System.out.println("Tie game.");
        }else if(playerCnt == 21){
            System.out.println("You win, congratulations!");
        }else if(compCnt == 21){
            System.out.println("You lose!");
        }else if(compCnt > 21 && playerCnt < 21){
            System.out.println("\nBun Bun bust! You win, congratulations!");
        }else if(playerCnt > 21 && compCnt > 21) {
            System.out.println("\nYou both bust! Tie game.");
        }else if(21-playerCnt > 21-compCnt && playerCnt < 21 && compCnt < 21){
            System.out.println("\nYou lose!");
        }else if(21-playerCnt < 21-compCnt && playerCnt < 21 && compCnt < 21){
            System.out.println("\nYou win, congratulations!");
        }
        else if(21-playerCnt < 21-compCnt && playerCnt > 21){
            System.out.println("\nYou bust!");
        }else if(playerCnt == compCnt){
            System.out.println("Tie game.");
        }
    }

    //wHaT'S aN aCe cArD idk what you're saying D:
}