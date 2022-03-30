import java.util.Scanner;

public class MethodExercises {

    public static int addition(int x, int y){
        return x+y;
    }
    public static int subtraction(int x, int y){
        return x-y;
    }
    public static int multiplication(int x, int y){
        int multiple=0;
        for(int i=0;i<y;++i){
          multiple+=x ;
        }
        return multiple;

    }
    public static int division(int x, int y){
        return x/y;
    }

    public static int remainder(int x, int y){
        return x%y;
    }


//    public static int getInteger(int min, int max){
//        Scanner sc = new Scanner(System.in);
//     int userInput= sc.nextInt();
//        if (userInput < min || userInput >max) {
//            System.out.println("All done!");
//            return;
//        }
//        System.out.print("Enter a number between 1 and 10: ");
////        int userInput = getInteger(1, 10);
//    }

    public static void main(String[] args) {
        System.out.println(addition(2,5));
        System.out.println(subtraction(100,10));
        System.out.println(multiplication(5,5));
        System.out.println(division(100,5));


    }

}
