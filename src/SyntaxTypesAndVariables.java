public class SyntaxTypesAndVariables {
    public static void main(String[] args) {
        /**
         * *statements
         */
//
        System.out.println("this is a statement");
        //// Variables
///**
// * must be defined before you can use them
// *
// * can start with a letter,underscore or dollar sign
// * consists of letters, and underscores or digits
// * it cannot be more than 250 characters
// *
// * initiate when assigned value
// */
//
//// Casting
///**
// * JS-> parseInt() -> type cohersion ==== casting
// *
// * Two Types:
// *
// * implicit- Imply, based on context// not clearly defined
// *
// * Explicit-
// *
// */

// byte	1	Very short integers from -128 to 127

        byte myBite=127;
        System.out.println("myBite = "+myBite);
// short	2	Short integers from -32,768 to 32,767
        short myShort=24000;
        System.out.println("myShort = "+myShort);
// int	4	Integers from -2,147,483,648 to 2,147,483,647
        int myInt =1234567891;
        System.out.println("myInt ="+myInt);
// long	8	Long integers from -9,223,372,036,854,775,808 to 9,223,372,036,854,775,807
        long myLong= 100_000_000_000_000L;
        System.out.println("myLong = "+myLong);
//  float	4	Single-precision, floating-point numbers from -3.4E38 to 3.4E38 with up to 7 significant digits
        float myFloat= 1.123456F;
        System.out.println("myFloat ="+myFloat);
// double	8	Double-precision, floating-point numbers from -1.7E308 to 1.7E308 with up to 16 significant digits
        double myDouble= 1.1234567891234564;
        System.out.println("myDouble = " + myDouble);
// char	2	A single Unicode character that’s stored in two bytes
        char myChar='C';
        System.out.println("myChar = " + myChar);
//boolean	1	A true or false value
        boolean myBool=true;
        System.out.println("myBool = " + myBool);
// Reference data types
// null if not assigned
//String
        String myString="Double quotes for strings";
        System.out.println("myString = " + myString);
        //escape characters
        myString ="He said \"hey there buddy\" ";
        System.out.println("myString = " + myString);
/**
 * Reserved Keywords
 * words that can't be used outside of the defined purpose
 *
 * for, continue,new,switch etc
 *
 * Constants
 *  are variables that can not be changed
 *  Java uses a keyword called final
 *  Naming conventions:
 *  PascalCase = first character is Cap
 *  or
 *  ALL CAPS
 *
  */
final int FINAL_VALUE=11;
        System.out.println("FINAL_VALUE = " + FINAL_VALUE);
/**
 * Arithmetic
 * Operators and increments are very similar to Javascript
 *
  */

    }
}

