import java.util.Scanner;
public class Bob {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);


        String choice="y";
        do{
            System.out.println("What do you want to say to Bob?");
            String input= sc.nextLine();


            if (input.endsWith("!")){
                System.out.println("Whoa, Chill out!");
                continue;
            }
            if (input.endsWith("?")){
                System.out.println("Sure");
                continue;
            }
            if (input.length() ==0){
                System.out.println("Fine be that way!");
                continue;
            }
            else {
                System.out.println("Whatever");
            }

            // See if the user wants to continue
            System.out.print("Anything else? (y/n): ");
            choice = sc.next();
            System.out.println();
            sc.nextLine();

        }
        while (!choice.equalsIgnoreCase("n"));


    }
}
