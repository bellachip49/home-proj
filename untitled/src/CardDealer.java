import java.util.ArrayList;
import java.util.Scanner;

public class CardDealer {
    //fields
    private ArrayList<Integer> playerHand = new ArrayList<>();
    private ArrayList<Integer> compHand = new ArrayList<>();
    private ArrayList<Integer> cardDeck = new ArrayList<>();
    private Scanner input = new Scanner(System.in);
    private String choice = "";

    //getter
    ArrayList<Integer> getCardDeck(){
        return cardDeck;
    }
    ArrayList<Integer> getPlayerHand(){
        return playerHand;
    }
    ArrayList<Integer> getCompHand(){
        return compHand;
    }
    String getChoice(){
        return choice;
    }

    //no setter

    //other methods
    void fillCardList(){
        //52 slots, 52 cards
        for(int i = 1; i <= 10; i++) {
            for (int j = 0; j < 4; j++) {
                cardDeck.add(i);
            }
        }
        for(int k = 0; k < 12; k++){
            cardDeck.add(10);
        }
    }

    void printList(ArrayList listToPrint){
        for(int i = 0; i < listToPrint.size()-1; i++){
            System.out.print(listToPrint.get(i) + ", ");
        }
        System.out.print(listToPrint.get(listToPrint.size()-1));
    }

    int dealCard(){
        int rand = (int)(Math.random() * cardDeck.size()) + 1;
        int pickedCard = cardDeck.get(rand);
        cardDeck.remove(rand);
        return pickedCard;
    }

    ArrayList<Integer> gameSetup(ArrayList<Integer> cardHand){
        for(int i = 0; i < 2; i++){
            cardHand.add(dealCard());
        }
        return cardHand;
    }

    String askMove(){
        while(true) {
            System.out.print("\nWhat would you like to do? (Please enter the letter a or b) \n\ta) hit (add a card)\n\tb) stay (do not draw a card)\n>>> ");
            choice = input.nextLine();
            if(choice.equalsIgnoreCase("a")){
                return "cont";
            }
            if(choice.equalsIgnoreCase("b")){
                return "exit";
            }
        }
    }

//    String askMove(){
//        choice = input.nextLine();
//        while(!(choice.equals("a") || choice.equals("b"))){
//            System.out.print("Please input a correct input");
//            choice = input.nextLine();
//        }
//        System.out.print("\nWhat would you like to do?(Please enter the letter a or b");
//        if(choice.equalsIgnoreCase("a")){
//            return "cont";
//        }
//        else if(choice.equalsIgnoreCase("b")){
//            return "exit";
//        }else{
//            return "";
//        }
//    }



    void decideNext(String option, ArrayList<Integer> cardHand){
        if(option.equals("cont")){
//            System.out.println("add card"); //debug
            cardHand.add(dealCard());
        }
//        else{
//            System.out.println("end game"); //debug
//        }
    }
}
