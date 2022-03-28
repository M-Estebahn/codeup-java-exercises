import java.util.Scanner;
public class ConsoleExercises {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
//        System.out.println("Enter your first name");
//        String firstName= sc.next();
//        System.out.println("You entered: "+firstName);
//        System.out.println("Enter your last name");
//        String lastName=sc.next();
//        System.out.println("You entered: "+lastName);
//        System.out.println("Your name is: "+firstName+" "+lastName);

        double pi = 3.14159;

        System.out.printf("The value of pi is approximately: %.2f %n", pi);

        System.out.println("enter an integer");
        int userInt=sc.nextInt();
        System.out.println("you entered: "+userInt);

        System.out.println("enter 3 words");
        String str1= sc.next();
        String str2=sc.next();
        String str3= sc.next();

        System.out.println(str1);
        System.out.println(str2);
        System.out.println(str3);

        System.out.println("enter a sentence");
        String sent=sc.next();
        System.out.println(sent);

        System.out.println("Enter a sentence again");
        sc.nextLine();
        String sentence=sc.nextLine();
        System.out.println(sentence);

        System.out.println("enter the width");
        int width= sc.nextInt();

        System.out.println("enter the length");
        int length=sc.nextInt();

        System.out.println("The Area is:"+(length*width));
        System.out.println("The Perimeter is:"+((length*2)+(width*2)));


    }
}
