import java.util.Scanner;

public class Runner {
    public static int calcBlue(int green, int blue){
        return (blue + (green / 3));
    }
    public static int calcPurple(int green, int blue, int purple){
        int tempBlues = (blue + (green / 3)); //craft to blue
        return (purple + (tempBlues / 3));
    }
    public static void main(String [] args){
        int green = 0;
        int blue = 0;
        int purple = 0;
        String answer = "";
        Scanner input = new Scanner(System.in);
        System.out.println("green: ");
        green = input.nextInt();
        System.out.println("blue: ");
        blue = input.nextInt();
        System.out.println("purple: ");
        purple = input.nextInt();
        System.out.println("Calculate number of green, blue, or purple? (type out the entire word for corresponding color");
        answer = input.next();
        if(answer.equalsIgnoreCase("green")){
            System.out.println("You have " + green + " green drops.");
        }else if(answer.equalsIgnoreCase("blue")){
            System.out.println("You can craft the existing green, add it to blue, and have a total of " + calcBlue(green, blue) + " blue drops.");
        }else{
            System.out.println("You can combine blues and greens into purple, add them to existing purple, and get a total of " + calcPurple(green, blue, purple) + " purple drops.");
        }
//        System.out.println("Calculate number of green, blue, or purple?");
//        answer = input.next();
//        while(answer.equalsIgnoreCase("green") || answer.equalsIgnoreCase("blue") || answer.equalsIgnoreCase("purple")){
//
//        }

    }
}
