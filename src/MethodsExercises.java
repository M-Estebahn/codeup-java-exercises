import java.lang.Math;
import java.util.Scanner;

public class MethodsExercises {
    Scanner sc = new Scanner(System.in);
    public static int addition(int x, int y){
        return x+y;
    }
    public static int subtraction(int x, int y){
        return x-y;
    }
//    public static void multiplication(int x, int y){
//        if (y==0){
//            return;
//        }
//       return x+(multiplication(x, y-1)
//    }

    public static int division(int x, int y){
        return x/y;
    }

    public static int remainder(int x, int y){
        return x%y;
    }


    public static int getInteger(int min, int max){
        Scanner sc = new Scanner(System.in);
     int userNum= sc.nextInt();
        if (userNum >= min && userNum <=max) {
            return userNum;
        }
        System.out.println("Invalid number, Try again");
        return getInteger(min,max);
    }

    public static long getFactorial() {
        System.out.println("Enter a number between 1 and 10 to get the factorial");
        int userNum = getInteger(1, 10);
        int i, fact = 1;
        for (i = 1; i <= userNum; i++) {
            fact = fact * i;

        }return fact;
    }

    public static void diceRoll() {
        Scanner sc = new Scanner(System.in);
        String choice = "y";
        do {
            System.out.println("How Many sides do your Dice have 4-20?");
            int diceSides = getInteger(4, 20);
            int min = 1;
            int range = diceSides - min + 1;

            // generate random numbers within 1 to 10
//        for (int i = 0; i < diceSides; i++) {
            int rand = (int) (Math.random() * range) + min;
            int rand2 = (int) (Math.random() * range) + min;

            // Output is different everytime this code is executed
            System.out.println("First Dice Reads: " + rand);
            System.out.println("Second Dices Reads: " + rand2);
// See if the user wants to continue
            System.out.print("would you like to roll again?(y/n): ");
            choice = sc.next();
            System.out.println();
            sc.nextLine();
        }
        while (!choice.equalsIgnoreCase("n"));

    }


//        ;


//
//    // TODO: use recursion to print out a given number up through 100
//     public static void countTo100(int num) {
//        if(num>=101){
//            System.out.println("Nothing left");
//            return;
//        }
//         System.out.println(num);
//        countTo100(num+1);
//     }


//    // TODO: use recursion to add all numbers up from 1 to a given number
//     public static int addNums(int num) {
//        if (num==1){
//            return 1;
//        }
//        return num + addNums(num-1);
//     }

    public static void main(String[] args) {
//        System.out.println(addition(2,5));
//        System.out.println(subtraction(100,10));
////       multiplication(5,5);
//        System.out.println(division(100,5));
//        System.out.println(remainder(8,3));
////        countTo100(5);
////        System.out.println(addNums(10));
//        System.out.print("Enter a number between 1 and 10: ");
//        int userInput = getInteger(1, 10);
//        System.out.println(userInput);
//        System.out.println(getFactorial());
//        diceRoll();


    }

}
