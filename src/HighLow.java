import java.util.Random;
import java.util.Scanner;

public class HighLow {



    public static void main(String[] args) {
        Random randI = new Random();
        Scanner sc = new Scanner(System.in);
        int myRandInt = randI.nextInt(100);
        myRandInt = myRandInt + 1;

        int userChoice;
        do {
            System.out.println("Please enter a number between 1-100");
            userChoice = sc.nextInt();
            if (userChoice < 0 || userChoice > 100) {
                System.out.println("that is not a valid selection");
                continue;
            }
            if (userChoice == myRandInt) {
                System.out.println("Good choice");
            }


        } while (userChoice!=myRandInt);
    }



}
