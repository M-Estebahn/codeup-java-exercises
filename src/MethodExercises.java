import java.util.Scanner;

public class MethodExercises {

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
        System.out.print("Enter a number between 1 and 10: ");
     int userInput= sc.nextInt();
        if (userInput > min || userInput <max) {
            return 1;
        }
        return userInput;
        }
//        ;
////        int userInput = getInteger(1, 10);
//    }
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
        System.out.println(addition(2,5));
        System.out.println(subtraction(100,10));
//       multiplication(5,5);
        System.out.println(division(100,5));
        System.out.println(remainder(8,3));
//        countTo100(5);
//        System.out.println(addNums(10));
        getInteger(5,20);


    }

}
