
public class JavaWarmups {


    public static char returnFirstCapitalLetter(String str){

        for(int i=0; i<str.length(); i++) {
            if(Character.isUpperCase(str.charAt(i))) {
                return  str.charAt(i);
            }
        }
        return ' ';
    }

    public static void main(String[] args) {
        System.out.println(returnFirstCapitalLetter("hellO"));// returns 'O'
        System.out.println(returnFirstCapitalLetter("hello")); // returns ' '
        System.out.println(returnFirstCapitalLetter("hEllo")); // returns 'E'
        System.out.println(returnFirstCapitalLetter("hELlO")); // returns 'E'
        System.out.println(returnFirstCapitalLetter("H")); // returns 'H'

    }
}
