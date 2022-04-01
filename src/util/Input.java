package util;

import java.util.Scanner;

public class Input {
    private final Scanner scanner;

    public Input(){
        this.scanner = new Scanner(System.in);
    }

    public String getString(){
        System.out.println("Enter a string");
        return scanner.nextLine();
    }

    public  Boolean yesNo(){
        System.out.println("if you enter yes this will return true");
        String userInput= scanner.next();
        return userInput.equalsIgnoreCase("y") || userInput.equalsIgnoreCase("yes");
    }

    public int getInt(int min, int max){
        System.out.println("Enter an Integer between"+min+" & "+ max);
        int userInput=scanner.nextInt();
        if (userInput>min&&userInput<max){
            System.out.println("int is with range");
            return userInput;
        }else {
            return getInt(min, max);
        }
    }

    public int getInt(){
        System.out.println("enter an Integer");
        return scanner.nextInt();
    }

    public double getDouble(double min,double max){
        System.out.println("enter an double between"+min+" & "+max);
        double userInput= scanner.nextDouble();
        if (userInput>min && userInput<max){
            System.out.println("double is within range");
            return userInput;
        }else {
            System.out.println("try again");
            return getDouble(min, max);
        }
    }

    public double getDouble() {
        System.out.println("enter a double");
        return scanner.nextDouble();
    }
}

class InputTest{
    public static void main(String[] args) {

        Input input1= new Input();
        System.out.println("input1 = " + input1.getString());

        System.out.println("input1.getInt() = " + input1.getInt());

        System.out.println("input1.yesNo() = " + input1.yesNo());

        System.out.println("input1.getInt(20,100) = " + input1.getInt(20, 100));

        System.out.println("input1.getDouble(.01,.99) = " + input1.getDouble(.01, .99));

        System.out.println("input1.getDouble() = " + input1.getDouble());


    }
}
