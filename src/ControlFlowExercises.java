import java.util.Scanner;
public class ControlFlowExercises {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

//        int i = 5;
//        while (i <= 15) {
//            System.out.println(i);
//            i++;
//        }
//
//       long start = 2;
//
//        do {
//            System.out.println(start);
//            start*=start ;
//        } while (start <= 1000000);

//        for (int i=5 ; i<=15 ; i++){
//            System.out.println(i);
//        }
//        for (long  i=2;i<=100000000; i*=i){
//            System.out.println(i);
//        }
        for(int i=0; i<=100;++i){
            if(i % 3 ==0 && i % 5 ==0) {
            System.out.println("FizzBuzz");
                continue;
        }if (i%3 == 0){
             System.out.println("Fizz");
                continue;
            }if (i%5==0){
                System.out.println("Buzz");

            }else{
                System.out.println(i);
            }
        }
        // Welcome the user (code from https://stackoverflow.com/questions/22441530/java-powers-display-table)
        System.out.println("Welcome to the Squares and Cubes table");
        System.out.println();


        String choice = "y";

        do
        {
            // Get input from the user
            System.out.print("Enter an integer: ");
            int integer = sc.nextInt();

            // Create a header
            String header = "Number  " + "Squared " + "Cubed   " + "\n"
                    +   "======  " + "======= " + "=====   ";
            System.out.println(header);

            int square = 0;
            int cube = 0;

            String row = "";
            for (int i = 1; i <= integer; i++)
            {

                square = i * i;
                cube = i * i * i;

                row = i + "       " + square + "       " + cube;
                System.out.println(row);
            }

            // See if the user wants to continue
            System.out.print("Continue? (y/n): ");
            choice = sc.next();
            System.out.println();

        }
        while (!choice.equalsIgnoreCase("n"));

        String proceed="y";

        do{
            System.out.println("Enter a numerical grade value");
            int grade=sc.nextInt();

            if (grade<= 100 && grade>=88){
                System.out.println("A");
            }
            if (grade<= 87 && grade>=80){
                System.out.println("B");
            }
            if (grade<= 79 && grade>=67){
                System.out.println("C");
            }
            if (grade<= 66 && grade>=60){
                System.out.println("D");
            }
            if (grade<= 59 && grade>=0){
                System.out.println("F");
            }



            // See if the user wants to continue
            System.out.print("Continue? (y/n): ");
            choice = sc.next();
            System.out.println();

        }
        while (!choice.equalsIgnoreCase("n"));
    }
}
