import java.util.Scanner;

public class TracePrefarm {
    public static void main(String [] args){
        Scanner input = new Scanner(System.in);
        int reqGreen;
        int reqBlue;
        int reqPurple;
        int currGreen;
        int currBlue;
        int currPurple;

        System.out.println("Green required: ");
        reqGreen = input.nextInt();
        System.out.println("Blue required: ");
        reqBlue = input.nextInt();
        System.out.println("Purple required: ");
        reqPurple = input.nextInt();
        System.out.println("Current green: ");
        currGreen = input.nextInt();
        System.out.println("Current blue: ");
        currBlue = input.nextInt();
        System.out.println("Current purple: ");
        currPurple = input.nextInt();

        //calculate green needed
        int greenNeed = reqGreen - currGreen;
        if(greenNeed < 0){ //negative means theres more green than required
            int extraGreen = -1 * greenNeed;
            greenNeed = 0; //no need to farm green
            currBlue += (extraGreen / 3); //integer divide to make one full unit of mat
        }
        int blueNeed = reqBlue - currBlue;
        if(blueNeed < 0){
            int extraBlue = -1 * blueNeed;
            blueNeed = 0;
            currPurple += (extraBlue / 3);
        }
        int purpleNeed = reqPurple - currPurple;
        if(greenNeed > 0 || blueNeed > 0 || purpleNeed > 0){
            System.out.println("You need " + greenNeed + " greens, " + blueNeed + " blues, and " + purpleNeed + " purples.");
        }
        if(purpleNeed < 0){ //still need
            System.out.println("All mats farmed. Prefarming complete.");
        }


    }
}
