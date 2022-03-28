public class ControlFlowExercises {
    public static void main(String[] args) {
        int i = 5;
        while (i <= 15) {
            System.out.println(i);
            i++;
        }

        int start = 0;

        do {
            System.out.println(start);
            start += 2;
        } while (start <= 100);


    }
}
