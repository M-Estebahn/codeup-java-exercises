package grades;

import org.w3c.dom.ls.LSOutput;

import java.text.DecimalFormat;
import java.util.HashMap;
import java.util.Scanner;
import java.util.Set;

public class GradesApplication {



    public static void main(String[] args) {
        DecimalFormat twod=new DecimalFormat(".##");
        Scanner scanner = new Scanner(System.in);
        HashMap<String,Student> students=new HashMap<>();

        Student benny=new Student("Benny");
        Student conway=new Student("Conway");
        Student gunn=new Student("Gunn");
        Student royce=new Student("Royce");
        benny.addGrade(99);
        benny.addGrade(97);
        benny.addGrade(95);
        conway.addGrade(87);
        conway.addGrade(90);
        conway.addGrade(91);
        gunn.addGrade(89);
        gunn.addGrade(94);
        gunn.addGrade(93);
        royce.addGrade(99);
        royce.addGrade(98);
        royce.addGrade(90);
        students.put("Nickel 9",royce);
        students.put("ThaButcher",benny);
        students.put("the Machine",conway);
        students.put("Westside",gunn);

        System.out.println( "Welcome!\n Here are the GitHub usernames");
        System.out.println();

        Set<String> gitHubUserNames=students.keySet();
        for(String gitHubUserName:gitHubUserNames){
            System.out.printf(" |%s| ",gitHubUserName);
        }

        System.out.println();
        System.out.println();

        String userInput= "none";

        String choice="yes";


do {

    do {
        System.out.println("What student would you like information on");
        userInput = scanner.nextLine();
        System.out.println();
        if (students.containsKey(userInput)) {
            System.out.printf("Name:%s - GitHub Username: %s %n Current Average: %.2f", students.get(userInput).getName(), userInput, (students.get(userInput).getGradeAverage()));
        } else System.out.println("Sorry, no student found by that name");

    } while (!students.containsKey(userInput));

    System.out.println("\n Would you like to see another student?");
    choice= scanner.next();
    System.out.println();
}while (choice.equalsIgnoreCase("yes"));







    }
}
