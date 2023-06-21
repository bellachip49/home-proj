public class ComputerLogic {
    //fields
    private final int stayLimit = 16;

    //no getter and setter

    //other methods
    String hitOrStay(int handCount){
        if(handCount < stayLimit){
            return "cont";
        }else{
            return "stop";
        }
    }
}
