public class ControlFlowExercises {
    public static void main(String[] args) {
        int i = 5;
        while (i <= 15) {
            System.out.println(i);
            i++;
        }

        int start = 100;

        do {
            System.out.println(start);
            start -= 5;
        } while (start >= -10);


    }
}
