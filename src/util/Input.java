package util;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Input {
    private static  Scanner scanner;

    public Input(){
        scanner = new Scanner(System.in);
    }

    public  String getString(){;
        return scanner.nextLine();
    }

    public  Boolean yesNo(){
        System.out.println("if you enter yes this will return true");
        String userInput= getString();
        return userInput.equalsIgnoreCase("y") || userInput.equalsIgnoreCase("yes");
    }

    public int getInt(int min, int max) {
        System.out.println("Enter an Integer between" + min + " & " + max);
        String userInput = getString();
        try {
            if (Integer.valueOf(userInput) > min && Integer.valueOf(userInput) < max) {
                System.out.println("int is with range");
                return Integer.valueOf(userInput);
            } else {
                return getInt(min, max);
            }
        } catch (InputMismatchException immx) {
            System.out.println("that is a mismatch");

        }catch (NumberFormatException nfx){
            System.out.println("Thats a format issue");
        }return getInt(min, max);
    }



    public int getInt(){
        System.out.println("enter an Integer");
        String userInput=getString();
      try{  return Integer.valueOf(userInput);
      }catch (NumberFormatException nfx){
          System.out.println("That is not an integer");
      }return getInt();
    }

    public double getDouble(double min,double max){
        System.out.println("enter an double between"+min+" & "+max);
        String userInput= getString();
        try {
            if (Double.valueOf(userInput) > min && Double.valueOf(userInput) < max) {
                System.out.println("double is within range");
                return Double.parseDouble(userInput);
            } else {
                System.out.println("try again");
                return getDouble(min, max);
            }
        }catch (InputMismatchException immx){
            System.out.println("that's a mismatch");
        }catch (NumberFormatException nfx){
            System.out.println("That's a format issue!");
        }return getDouble(min, max);
    }

    public double getDouble() {
        System.out.println("enter a double");
        String userInput= getString();
       try{ return Double.parseDouble(userInput);
       }catch (NumberFormatException nfx){
           System.out.println("That's not a double");
       }return getDouble();
    }
}

