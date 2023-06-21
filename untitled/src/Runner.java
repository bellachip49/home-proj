public class Runner {
    public static void main(String [] args){
        //make objects
        CardDealer cards = new CardDealer();
        CheckWin checkCard = new CheckWin();
        ComputerLogic compPlay = new ComputerLogic();

        //use objects
        cards.fillCardList();
//        cards.printList(cards.getCardDeck()); //list of possible cards
        cards.gameSetup(cards.getPlayerHand()); //deal player
        cards.gameSetup(cards.getCompHand()); //deal
//        System.out.println("your cards" + cards.getPlayerHand());
        while (!((cards.getChoice()).equals("b"))){ // || player's hand less than 21
            System.out.println("Your cards ("+ checkCard.reportCount(cards.getPlayerHand()) +"): ");
            cards.printList(cards.getPlayerHand());
            System.out.println("\nBun Bun's cards (?): ");
//            cards.printList(cards.getCompHand());
            System.out.println(cards.getCompHand().get(0) + ", ?");
            cards.decideNext(cards.askMove(), cards.getPlayerHand());
            if(checkCard.reportCount(cards.getPlayerHand()) > 21) {
                break;
            }
            cards.decideNext(compPlay.hitOrStay(checkCard.reportCount(cards.getCompHand())), cards.getCompHand());
        }
        while((compPlay.hitOrStay(checkCard.reportCount(cards.getCompHand()))).equals("cont") && checkCard.reportCount(cards.getPlayerHand()) > 21){
            cards.decideNext(compPlay.hitOrStay(checkCard.reportCount(cards.getCompHand())), cards.getCompHand());
        }
//        if(checkCard.reportCount(cards.getCompHand()) > 21){
//            System.out.println("\n\nBun Bun bust! You win, congratulations!");
//            //problem: will automatically stop the game comp busts; does not wait for you to hit until you ask to stop
//        }
        checkCard.whoWon(checkCard.reportCount(cards.getPlayerHand()), checkCard.reportCount(cards.getCompHand()));
        //add in condition to win
        System.out.println("\nYour cards ("+ checkCard.reportCount(cards.getPlayerHand()) +"): "); //something wrong w/ counting total cards; need to fix
        cards.printList(cards.getPlayerHand());
        System.out.println("\nBun Bun's cards ("+ checkCard.reportCount(cards.getCompHand()) +"): ");
        cards.printList(cards.getCompHand());
    }
}
